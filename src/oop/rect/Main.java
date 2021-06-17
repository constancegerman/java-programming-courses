package oop.rect;

public class Main {
    public static void main(String[] args) {
        Rect r = new Rect();
        r.setDim(5, 15);
        System.out.println("Perimeter is: " + r.perimeter());
        System.out.println("Area is: " + r.area());
    }
}
