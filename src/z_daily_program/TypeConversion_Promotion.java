package z_daily_program;
//byte 127
public class TypeConversion_Promotion {
    public static void main(String[] args) {

        byte ex1=10;
        byte ex2=30;

        int res= (ex1*ex2); //promotion
        System.out.println(res);



        int a=165;
        byte b=45;

        b=(byte) a;  //conversion / casting/ promotion
        System.out.println(b);

        a=b;
        System.out.println(a);

        float x= 2.5F;  // remove after . in int 2
        int y=3;
        y=(int)x;
        //System.out.println(y);

    }
}
