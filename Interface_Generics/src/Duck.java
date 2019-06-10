public class Duck implements canSwim,canFly {

    private String name;

    @Override
    public void fly() {
        System.out.println("Im a duck and i can fly!!");
        System.out.println("  ");
    }

    @Override
    public void swim() {
        System.out.println("I can also swim");
    }

    public Duck(String name) {
        this.name = name;
    }
}
