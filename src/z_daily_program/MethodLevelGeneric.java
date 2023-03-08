package z_daily_program;

import java.util.ArrayList;

public class MethodLevelGeneric {
    public static <A> void main(String[] args) {

        Integer num[]={12,55,33,77,0};
        add(num);
    }


public static <A>void add(A num[]){
    for (A a : num) {
        System.out.println(a);
    }
    System.out.println();
}




}
