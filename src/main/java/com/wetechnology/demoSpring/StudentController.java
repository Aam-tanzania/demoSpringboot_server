package com.wetechnology.demoSpring;


import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students")

    public Map<String, Object> getStudentDetails() {

        return Map.of(
            "name", "Anord Amri",
            "age", 25,
            "grade", "A",
            "email", "anord.amri@example.com"
        );
    }

 
    
}
