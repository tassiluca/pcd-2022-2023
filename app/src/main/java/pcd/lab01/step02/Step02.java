package pcd.lab01.step02;

/*
 * Non-terminating behaviors.
 */
public class Step02 {

    public static void main(String[] args) {
        new MyWorkerB("worker-B").start();
        new MyWorkerA("worker-A").start();
    }
}
