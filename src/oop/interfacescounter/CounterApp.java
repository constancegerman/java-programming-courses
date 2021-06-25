package oop.interfacescounter;

public class CounterApp {
    public static void main(String[] args) {
        Director director = new Director();
        // First
        director.force(new Counter() {
            @Override
            public String report(int countMonths) {
                return "Feedback for " + countMonths + " months.";
            }
        }, 10);

        // Second
        MyCounter myCounter = new MyCounter();
        director.force(myCounter, 10);
    }
}