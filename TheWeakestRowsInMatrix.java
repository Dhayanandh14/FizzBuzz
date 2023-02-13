package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TheWeakestRowsInMatrix {
    public static void main(String args[]){
        int[][] mat= {
                {1,0,0,0},
        {1,1,1,1},
            {1,0,0,0},
                {1,0,0,0}
        };
        int k =2;
        int count =0;
        List storeWeakestRows= new ArrayList();
        Map setRowIndex = new HashMap<>();
        for (int i = 0;i<mat.length;i++){
            System.out.println(mat[i].length);
            for (int j = 0; j<mat[i].length;j++){
                if (mat[i][j]==1){
                    count++;
                }
                System.out.println(mat[i][j]);
            }
              setRowIndex.put(i,count);
              storeWeakestRows.add(count);

            System.out.println("count inside the loop" + setRowIndex);
            count=0;
        }
        Map<String, String> result = sortMap(setRowIndex);
        System.out.println("count: " + storeWeakestRows);
        System.out.println("setRowIndex: " + setRowIndex);


        Set<String> keys = result.keySet();
        List keysChangeItToList = new ArrayList<>(keys);
        System.out.println("Keys: "+ keysChangeItToList);
        int[] storeAndCutKeys  = new int[k];

        for (int i=0;i<k;i++){
           storeAndCutKeys[i] = (int) keysChangeItToList.get(i);
        }

        System.out.println("storeAndCutKeys" + storeAndCutKeys);
    }

    private static Map sortMap(Map setRowIndex) {
        List <Map.Entry<Integer, Integer>> capitalList = new ArrayList<>(setRowIndex.entrySet());
            System.out.println("EntrysetPrint: "+ capitalList);
        // call the sort() method of Collections
         Collections.sort(capitalList, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));
        System.out.println("EntrysetPrint2: "+ capitalList);

        // create a new map
        LinkedHashMap<Integer, Integer> result = new LinkedHashMap();

        // get entry from list to the map
        for (Map.Entry<Integer, Integer> entry : capitalList) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
