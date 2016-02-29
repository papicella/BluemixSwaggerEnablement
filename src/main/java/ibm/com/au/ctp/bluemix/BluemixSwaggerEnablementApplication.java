package ibm.com.au.ctp.bluemix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@ComponentScan("ibm.com.au.ctp.bluemix")
@SpringBootApplication
public class BluemixSwaggerEnablementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BluemixSwaggerEnablementApplication.class, args);
	}

	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("employees")
				.apiInfo(apiInfo())
				.select()
				.paths(regex("/emps.*"))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Spring Employee REST Sample with Swagger")
				.description("Spring Employee REST Sample with Swagger")
				.version("1.0")
				.contact("Pas Apicella")
				.license("Apache License Version 2.0")
				.build();
	}
}
