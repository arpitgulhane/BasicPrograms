package com.basic;

public class Demo {
    public static void main(String[] args) {

        manager mg = new manager();
        mg.name();
        mg.lastname();
    }
}


abstract class employee{
    abstract void name();
    void lastname(){
        System.out.println("lastname");
    }
}

class manager extends employee{
    void name(){
        System.out.println("arpit");
    }
}