package day8;

import java.util.Random;

public class Employee_Wage {

    static void getEmployeeWages(int empCheck){

        int WagePerHrs = 20;
        int FullDayHrs = 8;
        int PartTimeHrs =4;

        int month = 20;
        int monthWage = 20;
        int dailyWage=0;


        switch (empCheck){
            case 0:
                System.out.println("Employee is Absent");
                break;

            case 1:
                System.out.println("Employee is Present but part time");
                dailyWage = WagePerHrs*PartTimeHrs;
                monthWage = dailyWage * month;
                System.out.println("Employee Daily Wage is :"+dailyWage);
                System.out.println("Employee Month Wage is :"+monthWage);
                break;

            case 2:
                System.out.println("Employee is Present");
                dailyWage = WagePerHrs * FullDayHrs;
                monthWage = dailyWage * month;
                System.out.println("Employee Daily Wage is " + dailyWage);
                System.out.println("Employee Month Wage is " + monthWage);

                break;

        }
    }


    public static void main(String[] args) {

        Random ran = new Random();
        int empCheck = ran.nextInt(3);

        getEmployeeWages(empCheck);

    }
}
