package Extend_Thread;

public class ThreadExtender extends Thread {

    @Override
    public  synchronized void run() {

        for (int i = 0; i < 6; i++) {
            System.out.println("Im the first thread " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException){
                System.out.println("First Thread sleeping: " + interruptedException);
            }
        }
    }
}
