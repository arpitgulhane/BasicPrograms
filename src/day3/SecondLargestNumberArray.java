package day3;

import java.util.Scanner;

public class SecondLargestNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr []= new int[5];

        System.out.println("Enter 5 Elements :");
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second Greatest Number is : "+arr[arr.length-2]);
    }
}
