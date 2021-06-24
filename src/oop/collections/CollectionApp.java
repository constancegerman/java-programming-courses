package oop.collections;

public class CollectionApp {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Richard");
        employees.add("Jack");
        employees.add("Chris");
        employees.add("Vivien");
        employees.add("Rihanna");
        employees.add("Rodger");
        employees.remove("Rodger");
        employees.remove("Vasy");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }

    }
}
