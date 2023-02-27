package basicDay2;
import java.util.*;
public class sumOfNaturalNum {
    public static void main(String[] args) {
        int num = 5;
        int sum =0;

        while (num != 0){
            sum = sum+num;
            num--;
        }
        System.out.println("Sum = "+sum);
    }

}
