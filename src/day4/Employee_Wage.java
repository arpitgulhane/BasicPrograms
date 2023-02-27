package day4;
import java.util.Random;
public class Employee_Wage {
    public static void main (String args []) {



        System.out.println("Welcome to employee payroll service");



        //UC1=> Check emp is present or not

        //Branch => empCheck_UC1



        //UC2 calculate daily emplyee wage

        // WagePerHrs = 20 FulldayHrs=8 PartTimeHrs =4;

        Random random = new Random();

        int empCheck = random.nextInt(3);//0,1,2

        int WagePerHrs = 20;

        int FullDayHrs = 8;

        int PartTimeHrs =4;
        int month = 20;
        int monthWage = 20;
        int dailyWage=0;


        //uc3 uc4


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








//        if(empCheck==0) {
//
//            System.out.println("Employee is Absent");
//
//            // UC_3 Part Time
//
//        }else if(empCheck==1) {
//
//            System.out.println("Employee is Present but part time");
//
//            int dailyWage = WagePerHrs*PartTimeHrs;
//            int monthwages=dailyWage*month;
//
//            System.out.println("Employee Daily Wage is "+dailyWage);
//            System.out.println("Employee Monthly Wage is "+monthwages);
//
//        }
//
//        else {
//
//            System.out.println("Employee is Present");
//
//            int dailyWage = WagePerHrs*FullDayHrs;
//            int monthwages=dailyWage*month;
//
//            System.out.println("Employee Daily Wage is "+dailyWage);
//            System.out.println("Employee Monthly Wage is "+monthwages);
//
//        }

    }

}
