package oop.inheritancefigure;

public class FigureApp {
    public static void main(String[] args) {
        Rect rect = new Rect(5, 10);
        Triangle triangle = new Triangle(rect.area());
        System.out.println(rect.area());
        System.out.println(triangle.area());
    }
}
