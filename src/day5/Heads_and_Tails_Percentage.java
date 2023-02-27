package day5;

import java.util.Random;
import java.util.Scanner;

public class Heads_and_Tails_Percentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int head =0, tail=0;
        int choic;
        Random random = new Random();
        int coin=random.nextInt(3);
//        System.out.println(coin);


        do {
        System.out.println("Enter Choice 1 to flip 0 to Exit");
        choic=sc.nextInt();
            if(choic==1) {
                if (coin == 1) {
                    System.out.println("Tail");
                    tail++;
                } else {
                    System.out.println("Head");
                    head++;
                }
            }
        }while (choic!=0);
        System.out.println("Percentage of Head :"+head);
        System.out.println("Percentage of Tail :"+tail);

    }
}
