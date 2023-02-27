package basicDay2;

public class SpringSeason {
    public static void main(String[] args) {
        int m = 4;
        int d = 5;
//        int m = Integer.parseInt(args[0]);
//        int d   = Integer.parseInt(args[1]);
        if(m>= 3 && m <= 6){
            if(m == 3 && d>= 20 && d<= 31 ){
                System.out.println("True");
            }
            else if(m ==4 && d>= 1 && d<30){
                System.out.println("True");
            }else if(m ==5 && d>= 1 && d<31){
                System.out.println("True");
            }else if(m ==6 && d>= 1 && d<30){
                System.out.println("True");
            }
            else
                System.out.println("Not Spring Season : False");
        }else{
            System.out.println("Not Spring Season : False");
        }
    }
}
