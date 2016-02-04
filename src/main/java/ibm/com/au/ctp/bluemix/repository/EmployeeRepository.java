package ibm.com.au.ctp.bluemix.repository;

import ibm.com.au.ctp.bluemix.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
    @Query("select e from Employee e where UPPER(e.name) like %?1%")
    List<Employee> findByName(String name);
}
