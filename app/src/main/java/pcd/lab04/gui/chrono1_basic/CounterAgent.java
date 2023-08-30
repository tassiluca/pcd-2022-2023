package pcd.lab04.gui.chrono1_basic;

public class CounterAgent extends Thread {

    private final Counter counter;
    private final Flag stopFlag;
    private final long delta;

    public CounterAgent(Counter c, Flag stopFlag, long delta) {
        counter = c;
        this.stopFlag = stopFlag;
        this.delta = delta;
    }
    public void run() {
        stopFlag.reset();
        while (!stopFlag.isSet()) {
            counter.inc();
            System.out.println(counter.getValue());
            try {
                Thread.sleep(delta);
            } catch(Exception ignored){ }
        }
    }
}
