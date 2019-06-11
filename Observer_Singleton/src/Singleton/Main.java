package Singleton;

public class Main {

    public static void main(String[] args) {


        Singleton x = Singleton.getInstance();

        System.out.println("String x from Singleton" + x.s);

    }
}
