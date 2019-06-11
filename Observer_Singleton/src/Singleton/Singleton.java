package Singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        s = ". Hello im a String from Singleton";
    }

    public String s;

     public static Singleton getInstance() {
        if(instance == null){

            instance= new Singleton();
        }

        return instance;
    }

}
