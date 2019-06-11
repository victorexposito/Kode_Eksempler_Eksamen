package Runnable;

public class Main {

    public static void main(String[] args) {


        Printer p = new Printer();

        char c = 'A';
        char c1 = 'B';
        char c2 = 'C';

        Thread t1 = new Thread(new Runnable(p,c), "Thread 1");
        Thread t2 = new Thread(new Runnable(p,c1), "Thread 2");
        Thread t3 = new Thread(new Runnable(p,c2), "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }

}
