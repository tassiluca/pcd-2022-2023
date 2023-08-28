package pcd.lab01.step05;

import java.util.*;

public abstract class Worker extends Thread {

    private final Random rand;

    public Worker(String name){
        super(name);
        rand = new Random();
    }

    protected void sleepFor(long ms){
        try {
            sleep(ms);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

    protected void wasteRandomTime(long min, long max){
        try {
            double value = rand.nextDouble();
            double delay = min + value*(max-min);
            sleep((int)delay);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

    protected void print(String msg){
        synchronized (System.out){
            System.out.print(msg);
        }
    }

    protected void println(String msg){
        synchronized (System.out){
            System.out.println(msg);
        }
    }
}
