package day5;

import java.util.Scanner;
//10  : 2 , 4 , 8 ,16 , 32
public class Power_Of_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N value :");
        int num = sc.nextInt();
        //assign 2 to calculate
        int power=2;

        if (num>31){
            System.out.println("Value should be less than 31");
        }else {
            for(int i=1;i<=num;i++){
                System.out.println(power);
                power=power*2;
            }

        }

    }
}
