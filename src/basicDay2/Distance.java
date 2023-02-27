package basicDay2;

import java.lang.Math;
import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        int x , y;
        System.out.println("Please Enter X and Y Value :");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        double distance = Math.sqrt(x*x + y*y);
        System.out.println("distance = "+distance);
    }
}
