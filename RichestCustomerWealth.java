package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RichestCustomerWealth {
    public static void main (String args[]){
        int[][] accounts = {
                {1,5},
                {7,3},{3,5}
        };
        List findMaxNumber = new ArrayList<>();
        int sum =0;
        for (int i = 0; i<accounts.length;i++) {
            for (int j = 0; j<accounts[i].length;j++){
            System.out.println(accounts[i][j]);
            sum = sum + accounts[i][j];
            }
            findMaxNumber.add(sum);
            sum =0;
        }

        int returnMaxNumber = (int) Collections.max(findMaxNumber);
    System.out.println("List of numbers: " + findMaxNumber);
    System.out.println(Collections.max(findMaxNumber));
    }
}
