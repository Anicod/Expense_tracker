package com.javaguides.personnel_expense_app;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Expense Tracker REST API",
				description = "Expense Tracker REST API Documentation",
				version = "v1.4",
				contact = @Contact(
						name = "animesh",
						email = "ani@123gmail.com",
						url = "ani.com"

				),
				license = @License(
						name = "apache",
						url = "ani.com"
				)

		),
		externalDocs = @ExternalDocumentation(
				description = "Expense Tracker REST API",
				url = "ani.com"
		)
)
public class PersonnelExpenseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonnelExpenseAppApplication.class, args);
	}

}
