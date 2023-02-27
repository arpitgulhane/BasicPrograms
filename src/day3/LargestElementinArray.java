package day3;

import java.util.Scanner;

public class LargestElementinArray {
    public static void main(String[] args) {

        int num []=new int[5];
        int largestnum=0;

        System.out.println("Enter 5 Elements :");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        for (int i=0 ;i<num.length;i++){

            if(num[i]>largestnum){
                largestnum = num[i];
            }
        }
        System.out.println("Largest Num :"+largestnum);

    }

}
