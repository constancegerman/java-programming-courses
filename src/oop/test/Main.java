package oop.test;

public class Main {
    public static void main(String[] args) {
//        int square = MyMath.square(20);
//        System.out.println(square);

        double length = MyMath.length(10);
        System.out.println(length);

        double area = MyMath.area(10);
        System.out.println(area);

        length = MyMath.length(10);
        System.out.println(length);

        int sum = MyMath.sum(1, 5, 4);
        System.out.println(sum);
    }
}
