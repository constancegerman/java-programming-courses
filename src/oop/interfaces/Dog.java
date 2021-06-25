package oop.interfaces;

public class Dog extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Bone!");
    }

    public void run() {
        System.out.println("Dog is running!");
    }
}
