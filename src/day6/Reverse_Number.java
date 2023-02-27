package day6;

public class Reverse_Number {
    public static void main(String[] args) {
        int num =123;
        System.out.println("Number :"+num);
        reversr(num);

    }
    static void reversr(int num){
        int rev=0;
        int next=0;

        while (num!=0) {
            next = num % 10;
            rev = rev * 10 + next;
            num = num / 10;
        }
        System.out.println("Reverse Number :"+rev);


    }

}
