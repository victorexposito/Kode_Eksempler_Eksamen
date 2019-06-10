public class Dog implements canSwim{

    private String name;

    @Override
    public void swim(){
        System.out.println("Im a dog and i can swim!");
        System.out.println("  ");
    }

    public Dog(String name) {
        this.name = name;
    }
}
