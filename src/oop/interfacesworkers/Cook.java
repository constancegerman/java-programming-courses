package oop.interfacesworkers;

public class Cook extends Employee implements Cooking {
    public Cook(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println(getName() + " is cooking!");
    }
}
