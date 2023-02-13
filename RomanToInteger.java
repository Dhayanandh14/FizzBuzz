package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    private static int getSumOfArraylist(List<Integer> sum) {
        int sumOfArraylist = sum.stream()
                .mapToInt(a -> a)
                .sum();
        return sumOfArraylist;
    }

//    private static List<Integer> getIntegers(Map<String, Integer> romansToInteger) {
//        List<Integer> sum = new ArrayList<>();
//
//        String getChar;
//        String hardcodedInput = "III";
//        for (int i = 0; i < hardcodedInput.length(); i++){
//            getChar = String.valueOf(hardcodedInput.charAt(i));
//            sum.add(romansToInteger.get(getChar));
//        }
//        return sum;
//    }

    private static List<Integer> getIntegers(Map<String, Integer> romansToInteger,String input) {
        List<Integer> sum = new ArrayList<>();
        int j=0;
        convertRomanToInteger(romansToInteger, sum, input, j);
        return sum;
    }

    private static void convertRomanToInteger(Map<String, Integer> romansToInteger, List<Integer> sum, String input, int j) {
        char getChar;
        String convertCharToString;
        for (int i = 0; i < input.length(); i++){

            if (j == input.length()){
                break;
            }
            System.out.println("J: "+ j);
            getChar = input.charAt(j);
            System.out.println("Getchar: " + getChar);

            if (getChar == 'I' && j < input.length()-1){
                if (input.charAt(j +1) == 'V'){
                    String storeRomanLetter = getChar+""+ input.charAt(j +1);
                    System.out.println("IV CEHCK: "+ romansToInteger);
                    sum.add(romansToInteger.get(storeRomanLetter));
                    System.out.println(romansToInteger.get(storeRomanLetter));
                    j = j +2;
                    System.out.println("DONE");
                }
                else if (input.charAt(j +1) == 'X'){
                    System.out.println();
                    convertCharToString = String.valueOf(romansToInteger.get(getChar+""+input.charAt(j +1)));
                    sum.add(Integer.valueOf(convertCharToString));
                    j = j +2;
                     System.out.println("DONE");
                }
                else {
                    System.out.println(romansToInteger.get(String.valueOf(getChar)));
                    sum.add(romansToInteger.get(String.valueOf(getChar)));
                    j = j +1;
                     System.out.println("DONE");
                }
            }

            else if (getChar == 'X' && j < input.length()-1){
                if (input.charAt(j +1) == 'L'){
                    String storeRomanLetter = getChar+""+ input.charAt(j +1);
                    sum.add(romansToInteger.get(storeRomanLetter));
                    System.out.println(romansToInteger.get(storeRomanLetter));
                    j = j +2;
                    System.out.println("DONE");
                }
                 else if (input.charAt(j +1) == 'C'){
                    convertCharToString = String.valueOf(romansToInteger.get(getChar+"" +input.charAt(j +1)));
                    System.out.println("XC CHECK: "+ convertCharToString);
                    sum.add(Integer.valueOf(convertCharToString));
                    j = j +2;
                     System.out.println("DONE");
                }
                else {
                    System.out.println(romansToInteger.get(String.valueOf(getChar)));
                    sum.add(romansToInteger.get(String.valueOf(getChar)));
                    j = j +1;
                     System.out.println("DONE");
                }
            }

            else if (getChar == 'C' && j < input.length()-1){
                if (input.charAt(j +1) == 'D'){
                    String storeRomanLetter = getChar+""+ input.charAt(j +1);
                    System.out.println("CD CHECK: "+ storeRomanLetter);
                    sum.add(romansToInteger.get(storeRomanLetter));
                    System.out.println(romansToInteger.get(storeRomanLetter));
                    j = j +2;
                    System.out.println("DONE");
                }
                else if (input.charAt(j +1) == 'M'){
                    convertCharToString = String.valueOf(romansToInteger.get(getChar+""+input.charAt(j +1)));
                    System.out.println("CM Check: " + convertCharToString);
                    sum.add(Integer.valueOf(convertCharToString));
                    j = j +2;
                    System.out.println("DONE");
                }
                else {
                    System.out.println("came");
                    System.out.println(romansToInteger.get(String.valueOf(getChar)));
                    sum.add(romansToInteger.get(String.valueOf(getChar)));
                    j = j +1;
                    System.out.println("DONE");
                }
            }
            else{
                if (j >= input.length()){
                    break;
                }
                System.out.println("J VALUE: "+j);
                String getChar1 = String.valueOf(getChar);
                System.out.println(romansToInteger.get(getChar1));
                sum.add(romansToInteger.get(getChar1));
                System.out.println("CAME TO MAIN ELSE");
                j = j +1;
                System.out.println("DONE");

            }
        }
    }

    public static void main(String args[]){
        Map<String,Integer> romansToInteger = new HashMap<>();
        romansToInteger.put("I",1);
        romansToInteger.put("V",5);
        romansToInteger.put("X",10);
        romansToInteger.put("L",50);
        romansToInteger.put("C",100);
        romansToInteger.put("D",500);
        romansToInteger.put("M",1000);
        romansToInteger.put("IV",4);
        romansToInteger.put("IX",9);
        romansToInteger.put("XL",40);
        romansToInteger.put("XC",90);
        romansToInteger.put("CD",400);
        romansToInteger.put("CM",900);

        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inputSource = kbd.nextLine();
        List<Integer> sum = getIntegers(romansToInteger,inputSource);

        System.out.println(sum);
        int sumOfArraylist = getSumOfArraylist(sum);
//
        System.out.println("Output Sum Of ArrayList: "+ sumOfArraylist);

    }




}
