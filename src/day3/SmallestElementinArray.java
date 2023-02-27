package day3;

import java.util.Scanner;

public class SmallestElementinArray  {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]<largest){
                largest = arr[i];
            }
        }
        System.out.println("Smallest Element is :"+largest);

    }
}
