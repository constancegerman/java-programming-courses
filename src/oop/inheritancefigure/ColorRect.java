package oop.inheritancefigure;

public class ColorRect extends Rect {
    public ColorRect(double a, double b) {
        super(a, b);
    }

    public ColorRect(double size) {
        super(size, size);
    }

    @Override
    public double area() {
        return getA() * getB();
    }


}
