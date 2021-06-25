package oop.interfacesworkers;

public class Driver extends Employee implements Driving {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving!");
    }
}
