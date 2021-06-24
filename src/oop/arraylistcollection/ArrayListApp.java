package oop.arraylistcollection;

import java.util.ArrayList;

public class ArrayListApp {
    public static void main(String[] args) {
//        ArrayList<String> employees = new ArrayList<>();
//
//        employees.add("Sergio");
//        employees.add("Liana");
//        employees.add("Rina");
//        employees.add("Lama");
//        employees.add("Nat");
//
//        employees.remove(0);
//        employees.remove("Nat");
//
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
//        }
//
//        for (String name : employees) {
//            System.out.println(name);
//        }

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        int sum = 0;

        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }
}
