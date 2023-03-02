package com.basic;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        String s1="Arpit";
        String rev = "";

        for(int i=0;i<s1.length();i++){
            System.out.println("----"+s1.charAt(i)+""+i);
            rev = s1.charAt(i)+rev;
            System.out.println("----"+rev);

        }
        System.out.println("========"+rev);

    }

}
