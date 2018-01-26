package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

   @RequestMapping("/")

    public String firstWeek(@RequestParam("Number") int magicNumber){


       FindNumber callNumber=new FindNumber();
       String answer =callNumber.assignment(magicNumber);
       return "Your web page prints:<br/>Starting Number: "+ magicNumber+"<br/>"+ answer ;



   }


    }



