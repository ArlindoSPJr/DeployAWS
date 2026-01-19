package aws.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    
    @GetMapping
    public String hello() {
        return "Hello, World! This is a project deployed on AWS using Docker and Infrastructure as Code with Terraform.";
    }

}
