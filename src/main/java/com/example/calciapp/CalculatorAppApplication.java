package com.example.calciapp;

import java.awt.Desktop;
import java.net.URI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorAppApplication.class, args);
		
		// Automatically open the browser
        try {
            String url = "http://localhost:8080/index.html";
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(url));
            } else {
                System.out.println("Desktop not supported. Open manually: " + url);
            }
        } catch (Exception e) {
            System.out.println("Failed to launch browser: " + e.getMessage());
        }
	}

}

/* To run the application, use the following command:
http://localhost:8080/index.html


🧪 Example Inputs via Browser URL:
Addition: http://localhost:8080/api/calculate?num1=10&num2=20&operation=add

Subtraction: http://localhost:8080/api/calculate?num1=10&num2=5&operation=sub

Multiplication: http://localhost:8080/api/calculate?num1=6&num2=3&operation=mul

Division: http://localhost:8080/api/calculate?num1=10&num2=4&operation=div

*/