public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Ole");
        dog.swim();

        Duck duck = new Duck("Peter");
        duck.fly();
        duck.swim();


        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        GenericBox<String> stringBox = new GenericBox<String>();

        integerBox.add(10);
        stringBox.add("Hello World!");

        System.out.println("Integer value = " + integerBox.get());
        System.out.println("String value = " + stringBox.get());
    }
}
