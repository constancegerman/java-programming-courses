package oop.people;

public class Main {
    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People();
        People p3 = new People();
        p1.name = "Alexei";
        p1.age = 33;
        p1.weight = 97;
        p2.name = "Alex";
        p2.age = 50;
        p2.weight = 70;
        p3.name = "Sergei";
        p3.age = 15;
        p3.weight = 50;

//        double result = (p1.age + p2.age + p3.age) / 3;
//        System.out.println("Средний возраст: " + result);

        People[] p = new People[3];
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;

        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            sum += p[i].age;
        }
        System.out.println("Middle age: " + sum/(double)p.length + " years old.");
    }
}
