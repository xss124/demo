package com.example.demo.test.leetcodetest;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个高效的算法来搜索mxn矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列
 * */
public class test03 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        int[][] matrix={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target=8;
        System.out.println( searchMatrix(matrix, target));
        System.out.println(System.currentTimeMillis());
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }
        boolean stream = list.stream().filter(array -> array.equals(target)).findAny().isPresent();
        return stream;
    }
}
