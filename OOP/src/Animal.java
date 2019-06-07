public class Animal extends FlyingAnimal {

    public String name;
    public int age;

    public Animal(){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void iCanFly() {

    }

    @Override
    public String toString() {
        return "Mit navn er " + name + '\n' +
                "jeg er " + age + " gammel " ;
    }

    public void animalSound(){
        System.out.println("this is animal sounds");
    }

}
