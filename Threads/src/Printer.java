public class Printer {

    public void print(char c){
        for (int i = 0; i < 10; i++) {
            System.out.println(c);
        }

        try{
            Thread.sleep(20);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
