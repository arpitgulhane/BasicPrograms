package com.basic;

import java.util.Random;

public class RandomNum4 {
    public static void main(String[] args) {
        Random ran = new Random();
        int dice = ran.nextInt(9000)+1000;
        System.out.println("4 digit random Number ="+dice);
    }
}
