package oop.arraylistcollection;

import java.util.HashSet;

public class TreeSetCollection {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Gregory");
        names.add("Elizabeth");
        names.add("Lisa");
        names.add("Rachel");
        names.add("Lisa");
        names.add("Ann");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(4);
        numbers.add(5);
        numbers.add(11);
        numbers.add(3);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
