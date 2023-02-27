package basicDay2;

public class reverseNum {
    public static void main(String[] args) {
        int num = 850295;
        int reverse;
        int newNo = 0;

        System.out.println("Number = "+num);
        while (num != 0){
            reverse = num%10;
            newNo = newNo*10+reverse;
            num = num/10;
        }
        System.out.println("Reverse Number = "+newNo);
    }
}
