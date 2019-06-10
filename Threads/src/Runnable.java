

public class Runnable implements java.lang.Runnable {


    private  Printer printer;
    private char c;

    public Runnable(Printer printer, char c){
        this.printer=printer;
        this.c=c;
    }

    @Override
    public void run() {
        printer.print(c);
    }
}
