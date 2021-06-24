package oop.arraylistcollection;

import java.util.HashSet;

public class HashSetCollection {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Gregory");
        names.add("Elizabeth");
        names.add("Lisa");
        names.add("Rachel");
        names.add("Lisa");

        for (String name : names) {
            System.out.println(name);
        }
    }

}
