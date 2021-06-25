package oop.interfacescounter;

public class Director {
    public void force(Counter counter, int m) {
        String report = counter.report(m);
        System.out.println(report);
    }
}