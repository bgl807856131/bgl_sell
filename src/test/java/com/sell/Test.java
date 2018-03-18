package com.sell;

/**
 * Created by yfbu on 2018/3/17.
 */
public class Test {

    public static void main(String[] args){
        new Thread(() -> System.out.println("111")).start();
    }
}
