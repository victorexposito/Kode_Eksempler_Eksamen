package Extend_Thread;

public class MainThread {

    public static void main(String[] args) {

        ThreadExtender te = new ThreadExtender();
        te.start();

        SecondThread st = new SecondThread();
        st.start();
    }
}
