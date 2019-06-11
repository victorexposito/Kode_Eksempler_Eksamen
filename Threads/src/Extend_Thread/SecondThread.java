package Extend_Thread;

public class SecondThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 6; i++) {
            System.out.println("Im the second thread " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException){
                System.out.println("First Thread sleeping: " + interruptedException);
            }
        }
    }
}
