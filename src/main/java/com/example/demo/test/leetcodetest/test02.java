package com.example.demo.test.leetcodetest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 n/2 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素
 * */
public class test02 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println( getManyNum());
        System.out.println(System.currentTimeMillis());
    }

    private static int getManyNum() {
        //int[] nums= {4,4,4,1,4,4,4,5,4,4,1};
        int[] nums= {1,4,4};
        List<Integer> arrayList=new ArrayList();
        for (int m = 0; m < nums.length; m++) {
            arrayList.add(nums[m]);
        }
        List<Integer> collect = arrayList.stream().distinct().collect(Collectors.toList());
        //Map<Integer, Integer> map = new HashMap<>();
        for (Integer im : collect) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                if (im==nums[i]){
                    count++;
                   // map.put(im,count);
                    if (count>(nums.length/2)){
                        return im;
                    }
                }
            }
        }
        /*Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue()>(nums.length/2)){
                return entry.getKey();
            }
        }*/
        return -1;
    }
}
