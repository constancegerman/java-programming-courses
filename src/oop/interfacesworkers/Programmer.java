package oop.interfacesworkers;

public class Programmer extends Employee implements Programming {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void programm() {
        System.out.println(getName() + " is programming!");
    }
}
