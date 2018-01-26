package com.example.demo;

public class FindNumber {

    public String assignment(Integer get_number){
        String output= ""+get_number;
        while (get_number!=1) {
            if (get_number % 2 == 0) {
                get_number = get_number / 2;
            } else {
                get_number = get_number * 3 + 1;
            }
            output=output+"         "+get_number;
        }
        return output;
    }

}


