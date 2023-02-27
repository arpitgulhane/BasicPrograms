package day6;
//number whose sum of factors  1 + 2 + 3 = 6
import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=sc.nextInt();
        int sum=0;

        for (int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }

        if(sum == num){
            System.out.println(num+" is perfect Number");
        }else {
            System.out.println(num+" is not perfect Number");
        }

    }
}
