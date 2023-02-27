package day3;

import java.util.Scanner;

public class FrequencyOfArrayElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr []= new int[5];
        System.out.println("Enter 5 Number :");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        countFrequency(arr);

    }

    static void countFrequency(int arr[]){

        // sort array
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //get count of elements
        for(int i=0;i<arr.length;i++){
            int count=1 ,flag=0;
            for (int z=i+1;z<arr.length;z++){
                if(arr[i] == arr[z]){
                    count++;
                    flag=1;
                }
            }
            if(flag==1) {
                System.out.println(arr[i] + " : " + count);
            }
        }

    }
}

