/*
package com.example.demo.test;

public class test1 {
    public static void main(String[] args) {
        Num num=new Num();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 30; i++) {
                num.add();
                System.out.println("1111");
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 30; i++) {
                num.sub();
                System.out.println("2222");
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(num.getCount());
    }
}
class Num{
    private static  int count = 0;
    public synchronized  void  add(){
        count++;
    }
    public synchronized void sub(){
        count--;
    }

    public synchronized int getCount(){
         return count;
    }
}*/
