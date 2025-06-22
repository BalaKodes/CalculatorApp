package com.example.calciapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CalciController {

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation) {

        double result;
        switch (operation.toLowerCase()) {
            case "add": result = num1 + num2; break;
            case "sub": result = num1 - num2; break;
            case "mul": result = num1 * num2; break;
            case "div":
                if (num2 == 0) return "Error";
                result = num1 / num2; break;
            default:
                return "Error";
        }

        // Return integer if no decimals
        return (result == (int) result) ? String.valueOf((int) result) : String.valueOf(result);
    }
}

//  manually
//  to run the application, use the command: mvn spring-boot:run
//  to build the application, use the command: mvn clean package
//  to test the application, use the command: curl "http://localhost:8080/api/calculate?num1=10&num2=5&operation=add"
//  to test the application, use the command: curl "http://localhost:8080/api/calculate?num1=10&num2=5&operation=sub"