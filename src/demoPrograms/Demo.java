package demoPrograms;
import java.util.*;

public class Demo {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int array[]=new int[100];
//        System.out.println("Array of numbers : ");
        for (int i=0;i<array.length;i++){
            array[i]=i+1;
//            System.out.println(array[i]=i+1);
        }
        System.out.println("Prime numbers are : ");
        for (int j=1;j<array.length;j++){
            isprime(array[j]);
        }
    }
    static void isprime(int num){
        //0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.
        int count = 0 ;
        for (int i=2;i<num/2;i++){
            if (num%i==0){
                System.out.println("Not prime"+num);
                count++;
                break;
            }
        }
        if (count==0){
             System.out.println("Prime number is "+num);

        }

    }
}
