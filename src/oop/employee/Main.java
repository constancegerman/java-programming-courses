package oop.employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Sergei", "programmer", 500);
        String info = e.info(5);
        System.out.println(info);
    }
}
