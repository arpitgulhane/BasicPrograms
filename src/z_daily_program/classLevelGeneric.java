package z_daily_program;

public class classLevelGeneric {
    public static void main(String[] args) {
        Generic <Integer> gen =new Generic<>();
        Integer num=355;
        gen.setvalue(num);
        gen.getValue();


    }
}

class Generic<A>{
    A num;
    public void setvalue(A num){
        this.num=num;
    }

    public A getValue(){
        System.out.println(this.num);
        return null;
    }
}