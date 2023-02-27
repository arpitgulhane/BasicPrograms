package day6;
//addition of previous two num   3=2*1
public class Fibonacci_Series {
    public static void main(String[] args) {
        int num=10;
        int first =0,second=1;

        for(int i=0;i<num;i++){
            System.out.println(first);
            int third=first+second;
            first=second;
            second=third;

        }

    }
}
