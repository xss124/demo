/*
package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Stream;

public class Demo {
    private static int[][] arrays={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
    public static void main(String[] args) {
        int i = new Scanner(System.in).nextInt();
        boolean result=Find(i,arrays);
        System.out.println(result);
    }
    public static boolean Find(int target, int[][] arrays) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                list.add(arrays[i][j]);
            }
        }
        boolean stream = list.stream().filter(array -> array.equals(target)).findAny().isPresent();
        System.out.println("target is "+stream);




        for (int i = 0; i < arrays.length; i++) {
            int rows = 0;
            int cell = arrays.length - 1;
            while ((rows <= arrays.length - 1) && (cell >= 0)) {
                if (arrays[rows][cell] == target) {
                    return true;
                } else if (arrays[rows][cell] < target) {
                    rows++;
                    if (rows <= arrays.length - 1) {
                        cell = arrays[rows].length - 1;
                    }
                } else if (arrays[rows][cell] > target) {
                    if (cell > 0) {
                        cell--;
                    } else {
                        cell = 0;
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
*/
