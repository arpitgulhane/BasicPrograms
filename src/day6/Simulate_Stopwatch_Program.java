package day6;

public class Simulate_Stopwatch_Program {
    public long startTimer=0;
    public long stopTimer=0;
    public long elapsed;


    public static void main(String[] args) throws Exception
    {



    }


    public void start()
    {
        startTimer=System.currentTimeMillis();
        System.out.println("Start Time is: "+startTimer);
    }

    public void stop()
    {
        stopTimer=System.currentTimeMillis();
        System.out.println("Stop Time is: "+stopTimer);
    }

    public long getElapsedTime()
    {
        elapsed=stopTimer-startTimer;
        return elapsed;
    }



}
