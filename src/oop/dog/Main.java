package oop.dog;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        d1.name = "Shark";
        d1.breed = "Hakki";
        d1.speed = 3;

        d2.name = "Hatti";
        d2.breed = "Horse";
        d2.speed = 5;

        d3.name = "Fuller";
        d3.breed = "Wolf";
        d3.speed = 1;

        String info1 = d1.info();
        String info2 = d2.info();
        String info3 = d3.info();

        d1.run();
        System.out.println("First dog: " + info1);
        d2.run();
        System.out.println("Second dog: " + info2);
        d3.run();
        System.out.println("Third dog: " + info3);
    }
}
