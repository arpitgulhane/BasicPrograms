package basicDay2;

public class reverseNum_for {
    public static void main(String[] args) {
        int num = 123;
        int reverse =0;
        int newnum =0;

        for(; num != 0 ; ){
            reverse = num%10;
            newnum = newnum*10+reverse;
            num = num/10;
        }
        System.out.println(newnum);

    }
}
