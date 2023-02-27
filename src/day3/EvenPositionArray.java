package day3;

import java.util.Scanner;

public class EvenPositionArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("Enter 5 Elements");
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }



    }
}
