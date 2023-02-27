package com.basic;
import java.util.*;

public class RandomNo {
    public static void main(String args[]){
//		int a=10;
//		int b=20;
//		//System.out.println("Boolean: "+c);
//		System.out.println("a>=b  "+(a>=b));
//		System.out.println("a<=b  "+(a<=b));

        Random ran = new Random();
        int diceNum = ran.nextInt(90)+10;
        System.out.println("Two digit random Number = "+diceNum);

    }

}
