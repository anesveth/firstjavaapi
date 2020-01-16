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
        int mark = scan.nextInt();
        return CalculateGrade(mark);

    }

    public static String CalculateGrade(int mark){
        if (mark<40){
            return ("GRADE: D\n");
        }
        if (mark>=40 && mark<50){
            return ("GRADE: C\n");
        }
        if (mark>=50 && mark<60){
            return ("GRADE: B\n");
        }
        if (mark>=60 && mark<=75){
            return ("GRADE: A\n");
        }
        if (mark>75){
            return ("GRADE: O\n");
        }
        return "Grade not available, try a different mark";

    }
}
