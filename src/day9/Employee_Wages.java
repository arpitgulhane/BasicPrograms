package day9;

import java.util.Random;

public class Employee_Wages {



    public static void main(String[] args) {

        Google g=new Google();
        Tata t=new Tata();

        Random ran = new Random();
        int empCheck = ran.nextInt(3);
        g.getEmployeeWages(empCheck);
        System.out.println("-------------------------------------------------------");
        t.getEmployeeWages(empCheck);
    }
}


class Google {
    static void getEmployeeWages(int empCheck){

        int WagePerHrs = 20;
        int FullDayHrs = 8;
        int PartTimeHrs =4;

        int month = 20;
        int monthWage = 20;
        int dailyWage=0;
        String companyName ="Google";

        switch (empCheck){
            case 0:
                System.out.println(companyName+" Employee is Absent");
                break;

            case 1:
                System.out.println(companyName+"Employee is Present but part time");
                dailyWage = WagePerHrs*PartTimeHrs;
                monthWage = dailyWage * month;
                System.out.println("Employee Daily Wage is :"+dailyWage);
                System.out.println("Employee Month Wage is :"+monthWage);
                break;

            case 2:
                System.out.println(companyName+"Employee is Present");
                dailyWage = WagePerHrs * FullDayHrs;
                monthWage = dailyWage * month;
                System.out.println("Employee Daily Wage is " + dailyWage);
                System.out.println("Employee Month Wage is " + monthWage);

                break;
        }
    }


}class Tata {
    static void getEmployeeWages(int empCheck){

        int WagePerHrs = 100;
        int FullDayHrs = 8;
        int PartTimeHrs =4;

        int month = 20;
        int monthWage = 20;
        int dailyWage=0;
        String companyName ="Tata";

        switch (empCheck){
            case 0:
                System.out.println(companyName+" Employee is Absent");
                break;

            case 1:
                System.out.println(companyName+"Employee is Present but part time");
                dailyWage = WagePerHrs*PartTimeHrs;
                monthWage = dailyWage * month;
                System.out.println("Employee Daily Wage is :"+dailyWage);
                System.out.println("Employee Month Wage is :"+monthWage);
                break;

            case 2:
                System.out.println(companyName+"Employee is Present");
                dailyWage = WagePerHrs * FullDayHrs;
                monthWage = dailyWage * month;
                System.out.println("Employee Daily Wage is " + dailyWage);
                System.out.println("Employee Month Wage is " + monthWage);

                break;
        }
    }


}