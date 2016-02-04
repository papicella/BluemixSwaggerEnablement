package ibm.com.au.ctp.bluemix.rest;

import ibm.com.au.ctp.bluemix.domain.Employee;
import ibm.com.au.ctp.bluemix.repository.EmployeeRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/emps")
public class EmployeeRest
{
    private static final Logger logger = LoggerFactory.getLogger(EmployeeRest.class);

    @Autowired
    EmployeeRepository employeeRepository;

    @ApiOperation(value = "listEmps", nickname = "listEmps")
    @RequestMapping(method = RequestMethod.GET, path="/allemps")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = List.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public List<Employee> listEmps ()
    {
        return employeeRepository.findAll();
    }

    @ApiOperation(value = "searchEmps", nickname = "searchEmps")
    @RequestMapping(method = RequestMethod.GET, path="/searchemps")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = List.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public List<Employee> searchEmps(@RequestParam(value="name") String name)
    {
        return employeeRepository.findByName(name.toUpperCase());
    }

    @ApiOperation(value = "findEmpById", nickname = "findEmpById")
    @RequestMapping(method=RequestMethod.GET, value="/employee/{empId}")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Employee.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public Employee findEmpById(@PathVariable String empId)
    {
        return (Employee) employeeRepository.findOne(new Long(empId));
    }
}
