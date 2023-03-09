package z_daily_program;

import java.util.Iterator;
import java.util.Stack;

public class StackPushPopExample {
    public static void main(String[] args) {
        Stack <Object> stk = new Stack<>();
        System.out.println("Adding number in stack");
        pushElement(stk , 10);
        pushElement(stk,11);
        pushElement(stk,12);
        pushElement(stk ,13);
        System.out.println("Stsck ="+stk);

//        System.out.println(stk.pop());
//        System.out.println("Stsck ="+stk);
//        boolean result = stk.empty();
//        System.out.println(result);
        popElement(stk);
        System.out.println("Stsck ="+stk);
        int Location=stk.search(11);
        System.out.println(Location);
        Location=stk.size();
        System.out.println(Location);

        Iterator iterator=stk.iterator();
        while (iterator.hasNext()){
            Object value=iterator;
            System.out.println("In iterator"+value );
        }
    }







    public static void pushElement(Stack stk, Object x){
        stk.push(x);
        System.out.println(x+"=>");
    }
    public static void popElement(Stack stk){
        System.out.println("pop Element is"+stk);
        stk.pop();

    }
}
