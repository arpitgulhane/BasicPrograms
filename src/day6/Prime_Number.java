package day6;
//Number not divisible by any number
public class Prime_Number {
    public static void main(String[] args) {
        int num =3;
        int flag=1;

       for(int i=2 ; i<(num/2);i++){
           if(num%i==0){
               flag = 0;
               break;
           }
       }
       if(flag==1){
           System.out.println(num+" is prime number");
       }else {
           System.out.println(num+" is Not prime Number");
       }

    }
}
