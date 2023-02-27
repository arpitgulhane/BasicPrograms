package day3;

import java.util.Scanner;

public class OddPositionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];

        System.out.println("Enter 5 Elements");
        for (int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println("Odd Position Numbers are : ");
        for (int i=0;i<arr.length;i++){
            if(i%2==0)
                System.out.println(arr[i]);

        }

    }
}
