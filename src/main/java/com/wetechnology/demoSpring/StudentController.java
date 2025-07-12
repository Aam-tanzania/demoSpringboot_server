package com.wetechnology.demoSpring;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/studentDetails")

    public Map<String, Object> getStudentDetails(){

       return Map.of(
            "StudentName", "Anord Amri Mwinuka",
            "School", "Ikulu Primary School",
            "Age", 27,
            "FatherName", "Amri Mwinuka"
        );
    }
    
}
