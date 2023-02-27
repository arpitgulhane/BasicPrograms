package day5;

import java.util.Scanner;

public class LeapYear_OrNot {
    public static void main(String[] args) {
        int year_orNot;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year :");
        year_orNot=sc.nextInt();
//        System.out.println(year_orNot.length);

        if((year_orNot%4==0) && (year_orNot%100!=0) || (year_orNot%400==0)){
            System.out.println(year_orNot+" is Leap Year");
        }else {
            System.out.println(year_orNot+" Not Leap Year");
        }
    }
}
