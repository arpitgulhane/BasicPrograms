package com.basic;

import java.util.Random;

//import java.util.*;
public class RandomNum3 {
    public static void main(String args[]){
        Random ran = new Random();
        int dicenum = ran.nextInt(900)+100;
        System.out.println("Three digit random Number = "+dicenum);
    }

}
