package com.example.demo.test.leetcodetest;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你两个按 非递减顺序 排列的整数数组nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，
 * 其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n
 * */
public class test04 {
    public static void main(String[] args) {
        int[] num1={1,2,8,9};
        int[] num2={2,3,4};
        int  m=4;
        int  n=3;
        long startTime = System.currentTimeMillis();
        System.out.println( searchMatrix(num1, m,num2,n));
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行花费时间："+(endTime-startTime));
    }

    public static boolean searchMatrix(int[] num1, int m, int[] num2, int n) {
        int[] num3=new int[m+n];
        for (int i = 0; i < m; i++) {
            num3 = num1.clone();
        }
        for (int j = 0; j < n; j++) {

        }
        return true;
    }
}
