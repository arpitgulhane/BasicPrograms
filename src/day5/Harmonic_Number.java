package day5;
//sum of the reciprocals of consecutive natural numbers
public class Harmonic_Number {
    public static void main(String[] args) {
        int num =2;
        double result =0.0;

        while (num>0){
            result = result+(double) 1/num;
            num--;
            System.out.println(result+" ");
        }


    }
}
