public class Dog extends Animal {


    public String color;

    public Dog(String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    @Override
    public void iCanFly() {
        System.out.println("i Cant fly");
    }

    @Override
    public String toString(){
        return (super.toString() + "og min farve er " + color );
    }

    @Override
    public void animalSound(){
        System.out.println("vow vow !!");
    }

}
