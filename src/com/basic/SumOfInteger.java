package com.basic;

public class SumOfInteger {
    public static void main(String args []){

        int sum = 0;
        System.out.println("Enter values ");
        for(int i=0; i<args.length;i++){
            System.out.println(args[i]);
            sum = sum+Integer.parseInt(args[i]);
        }
        System.out.println("sum ="+sum);

    }
}
