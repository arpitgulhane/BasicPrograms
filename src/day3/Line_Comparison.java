package day3;
import javax.sound.sampled.Line;
import java.awt.*;
import java.lang.*;

import static java.lang.Math.sqrt;

public class Line_Comparison {
static void equal(double length1,double length2){
    if(length1==length2){
        System.out.println("Two lines are Equal");
    }else {
        System.out.println("Two Lines are Not equal");
    }
}
    static void compate(double length1,double length2){
        if(length1==length2){
            System.out.println("Two lines are Equal");
        }else if(length1<length2){
            System.out.println("length 1 is less than length 2");
        }else {
            System.out.println("length 1 is greater than length 2");
        }

    }


    public static void main(String[] args) {

        Linee line = new Linee(0, 0, 3, 4);
        Linee line2 = new Linee(0, 0, 5, 4);
        double length = line.getLength();
        double length2 = line2.getLength();
        System.out.println("Length of line 1: " + length);
        System.out.println("Length of line 2: " + length2);

        equal(length,length2);
        compate(length,length2);
//        System.out.println(length.compareTo(length2));




//        Pooint p1=new Pooint(0,0);
//        Pooint p2=new Pooint(3,4);
//
//        Linee line=new Linee(p1,p2) ;
//        double length=line.getLength();
//        System.out.println("Length of Line :"+length);

    }

}

class Linee {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Linee(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return length;
    }
}




//
// class Pooint{
//    public int x;
//    public int y;
//    Pooint(int x , int y){
//        this.x=x;
//        this.y=y;
//    }
//    public int getX(){
//        return x;
//    }
//    public int getY(){
//        return y;
//    }
//}
//class Linee{
//    Pooint startPoint;
//    Pooint endPoint;
//    Linee(Pooint startPoint,Pooint endPoint){
//        this.startPoint=startPoint;
//        this.endPoint=endPoint;
//    }
//
//    public double getLength(){
//        int xdiff = endPoint.getX()-startPoint.getX();
//        int ydiff = endPoint.getY()-startPoint.getY();
////        sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2)     (Logic) 2nd is correct
//        return Math.sqrt(Math.pow(xdiff, 2) + Math.pow(ydiff, 2));
////        double lineLength = sqrt((xdiff^2)+(ydiff^2));
////        return sqrt(xdiff^2+ydiff^ydiff);
////        return lineLength;
//    }
//
//}