package z_daily_program;

public class Abstraction_interface {
    public static void main(String[] args) {
        New arpit=new New();
        arpit.pin();
        arpit.widrow();

//        ------------------
                car arpit2=new car();
                arpit2.test1();
    }
}

abstract class city{
// abstract people;
 void pin(){
     System.out.println("pin");
 }
}

class New extends city{
    void widrow(){
        System.out.println("Widrow");
    }
}

//----------------------------------------------------------------------
interface Autoobile{
    void test1();
}

class car implements Autoobile{
    @Override
    public void test1() {
        System.out.println("test 1");
    }
}