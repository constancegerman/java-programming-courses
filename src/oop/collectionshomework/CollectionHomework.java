package oop.collectionshomework;

import java.util.ArrayList;

public class CollectionHomework {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> uniteCollections = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        names.add("Lisa");
        names.add("Rachel");
        names.add("Ross");
        names.add("Joy");
        names.add("Chandler");
        names.add("Monica");
        names.add("Chloe");
        names.add("Lucas");
        names.add("Mya");
        names.add("Bob");

        for (int i = 0; i < numbers.size(); i++) {
            String strList = numbers.get(i) + " - " + names.get(i);
            uniteCollections.add(strList);
        }

        for (String str : uniteCollections) {
            System.out.println(str);
        }

    }
}
