package day5;

import java.util.Scanner;

public class Largest_AmongThree_Numbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Three Numbers :");
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        checkNumber(x,y,z);
    }
    static void checkNumber(int x, int y,int z){
        if(x>y){
            if(x>z){
                System.out.println(x+" is Greatest Number");
            }else {
                System.out.println(z+" is Greatest Number");
            }
        }else {
            if(y>z){
                System.out.println(y+" is Greatest Number");
            }else {
                System.out.println(z+" is Greatest Number");
            }
        }
    }
}
