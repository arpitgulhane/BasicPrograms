package day5;

public class Swap_Two_Numbers {
    public static void main(String[] args) {
        int a=50 , b= 100;
        System.out.println("Befor Swap :"+a+" "+b);
        swap(a,b);
    }

    static void swap(int a , int b){
        int temp;
        temp =a;
        a=b;
        b=temp;
        System.out.println("After Swap :"+a+" "+b);
    }
}
