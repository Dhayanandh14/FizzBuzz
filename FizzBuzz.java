package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String args[]){
        int hardCodedInput = 30;
        List<String> stringArray = new ArrayList<>();

        for (int i =1; i<=hardCodedInput;i++){
            System.out.println("I count: " + i);
            if (i%3 ==0 && i%5 ==0) {
                stringArray.add("FizzBuzz");
            }
            else if (i%3 == 0) {
                stringArray.add("Fizz");
            }
            else if (i%5 == 0) {
                stringArray.add("Buzz");
            }
            else {
                stringArray.add(String.valueOf(i));
            }
        }
        System.out.println(stringArray);
    }
}
