package com.example.demo.leetcode;

import java.util.Scanner;

public class ReduceNumberToZero {
    public static void main(String args[]) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter Input: ");
        int inputNumber = kbd.nextInt();
        int count = 0;
        boolean flag = true;
        while (flag && inputNumber !=0) {
            if (inputNumber % 2 == 0) {
                inputNumber = inputNumber / 2;
                System.out.println("CAME IF: "+  inputNumber);
            } else {
                inputNumber = inputNumber - 1;
                System.out.println("CAME ELSE");
            }
            if (inputNumber == 0) {
                flag = false;

            }
            count++;
            System.out.println("Store value: " + inputNumber);
        }
        System.out.println("count: " + count); //1 //2 //3 // 4//  5// 6
    }
}
