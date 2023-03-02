package z_daily_program;

class Over_loading{
    int add(int a , int b){
        System.out.println(a+b);
        return a+b;
    }
    void add(int a, int b, double d){
        System.out.println(a+b+d);
    }
    void add(double a, double b, double d){
        System.out.println(a+b+d);
    }

}

public class polymorphism_Overloading_Overriding {
    public static void main(String[] args) {

//        Method Overloading: Compile time
        Over_loading ov1=new Over_loading();
        ov1.add(5,6);
        ov1.add(5.5,6.7,7.6);

//      Method Overriding: Runtime
        Dog or=new Dog();
        or.make_sound();

    }
}


class Animal{

    public void make_sound(){
        System.out.println("Animal Make Sound...");
    }
}
class Dog extends Animal{
    public void make_sound(){
        System.out.println("Dog make sound...");
    }
}
