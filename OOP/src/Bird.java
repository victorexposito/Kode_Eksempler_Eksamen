public class Bird extends Animal{


    public String color;

    public Bird(String name, int age, String color){
        super(name, age);
        this.color = color;
    }


    @Override
    public void iCanFly() {
        System.out.println("But i can fly!");
    }

    @Override
    public String toString(){
        return (super.toString() + "og min farve er " + color );
    }


    public void animalSound(){
        System.out.println("Bird noises...");
    }
}
