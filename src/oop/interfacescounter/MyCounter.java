package oop.interfacescounter;

public class MyCounter implements Counter {
    @Override
    public String report(int countMonths) {
        return "Feedback for " + countMonths + " months.";
    }
}
