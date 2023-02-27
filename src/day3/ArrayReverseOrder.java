package day3;

import java.util.Scanner;

public class ArrayReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr []= new int[5];
        System.out.println("Enter Elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }


}
