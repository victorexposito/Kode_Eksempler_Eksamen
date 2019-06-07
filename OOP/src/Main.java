public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Ole", 10, "sort");
        System.out.println(dog.toString());
        dog.animalSound();
        dog.iCanFly();

        Bird bird = new Bird ("Liss", 15, "orange");
        System.out.println(bird.toString());
        bird.animalSound();
        bird.iCanFly();

        Animal an = new Animal();
        an.animalSound();

        Addition ad = new Addition();
        int sum1 = ad.add(2,2);
        System.out.println("summen af 2 tal = " + sum1);
        int sum2 = ad.add(5,4,2);
        System.out.println("summen af 3 tal = " + sum2);
    }
}
