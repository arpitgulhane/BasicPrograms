package basicDay2;

public class PalindromeNum_for {
    public static void main(String[] args) {
        int num = 121;
        int reverse = 0;
        int newnum = 0;
        int test = num;

        for(;num !=0 ;num=(num/10)){
            reverse = num%10;
            newnum = newnum*10+reverse;
        }
        if(test == newnum){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not Palindrome Number");
        }

//        System.out.println("test  "+test);
//
//        System.out.println("newnum  "+newnum);


    }
}
