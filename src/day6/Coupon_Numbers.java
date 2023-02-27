package day6;

import java.util.Random;
import java.util.Scanner;

public class Coupon_Numbers {
    public static int getCoupen(int n){
        Random rm=new Random();
        return (int)(rm.nextInt()*n);
    }

    public static int collect(int n){
        boolean [] isCollected = new  boolean[n];
        int count =0;
        int distinct= 0;

        while (distinct<n-1)
        {
            int value = getCoupen(n);
            count ++;
            if (!isCollected[value]){
                distinct++;
                isCollected[value]=true;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(args[0]);
        int n=sc.nextInt();
        int count = collect(n);
        System.out.println(count);
    }
}
