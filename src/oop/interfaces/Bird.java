package oop.interfaces;

public class Bird extends Animal implements CanRun, Flyable  {
    @Override
    public void eat() {
        System.out.println("Bird food!");
    }

    public void run() {
        System.out.println("Bird is running!");
    }

    public void fly() {
        System.out.println("Bird is flying!");
    }
}
