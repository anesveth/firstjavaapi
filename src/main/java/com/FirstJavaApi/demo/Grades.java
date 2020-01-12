package com.FirstJavaApi.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Grades {

    @RequestMapping("/")
    public String index(){
        Scanner scan = new Scanner(System.in);
        System.out.println("--GRADES--\n Write the mark the student got:");
        int grade = scan.nextInt();

        if (grade<40){
            return ("GRADE: D\n");
        }
        if (grade>=40 && grade<50){
            return ("GRADE: C\n");
        }
        if (grade>=50 && grade<60){
            return ("GRADE: B\n");
        }
        if (grade>=60 && grade<=75){
            return ("GRADE: A\n");
        }
        if (grade>75){
            return ("GRADE: O\n");
        }
        return "Grade not available, try a different mark";


    }
}
