package com.example.emplyeeangularapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "<-- Employee API -->",
        description = "Employee and Angular Project",
        version = "1.0"))
public class EmplyeeAngularApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmplyeeAngularApiApplication.class, args);
    }

}
