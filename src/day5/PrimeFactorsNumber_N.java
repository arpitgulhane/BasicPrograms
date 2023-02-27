package day5;

public class PrimeFactorsNumber_N {
    public static void main(String[] args) {
        //36 = 2*2*3*3
        //90 = 2*3*3*5
        int n = 90;
//        System.out.println(Math.sqrt(n));
        primeFactor(n);
    }



    static void primeFactor(int n){
        // Print the number of 2s that divide n
        while (n%2==0){
            System.out.println(2+" ");
            n=n/2;
        }
        //use when vlaue will be more than 2
        for (int i=3 ; i<=Math.sqrt(n);i+=2){
            while ((n%i==0)){
                System.out.println(i+" ");
                n=n/i;
            }
        }

        // when n is a prime number greater than 2
        if(n>2)
            System.out.println(n);

    }

}
