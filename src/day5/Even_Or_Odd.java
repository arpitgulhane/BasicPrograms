package day5;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even Number");
        }else {
            System.out.println(num+" is Odd Number");
        }
    }
}
