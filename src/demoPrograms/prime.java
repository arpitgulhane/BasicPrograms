package demoPrograms;

public class prime {
    public static void main(String[] args) {
        int num[]=new int [100];

        System.out.println("Numbers are :");
        for(int a=0;a<num.length;a++){
            num[a]=a+1;
//            System.out.println(num[a]);
        }
        System.out.println(num.length);
        for(int i=0;i<num.length;i++){
            checkprime(num[i]);
        }
    }


    static void checkprime(int num){
        boolean flag =false;
        for(int i=2;i<=(num/2);i++){
            if(num% i == 0){
                flag=true;
                break;
            }else {

            }
        }
        if (flag==false){
            System.out.println("Prime"+num);
        }

    }



}
