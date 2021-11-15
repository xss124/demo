package com.example.demo.test.leetcodetest;

import java.util.ArrayList;
import java.util.List;
/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * */
public class test01 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println( getOnlyOneNum());
        System.out.println(System.currentTimeMillis());
    }

    private static int getOnlyOneNum() {
        int[] nums= {2,2,0,1,4,3,4,5,3,5,1};
       /* List<Integer> list=new ArrayList();
        for(int i=0;i<nums.length;i++){
            int count=1;
            int num=nums[i];
            boolean b=list.stream().anyMatch(s -> num == s);
            if(b){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(num==nums[j]){
                    count++;
                    list.add(num);
                    continue;
                }
            }
            if(count==1){
                return num;
            }
        }
        return -1;*/
        int first = 0;
        for (int num : nums) {
            System.out.println(num+"----num");
            first ^= num;
            System.out.println(first+"====first");
        }
        return first;
    }
}
