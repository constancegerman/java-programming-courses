package oop.rect;

public class Rect {
    double length;
    double width;

    public void setDim(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double perimeter() {
        return (length + width) * 2;
    }

    public double area() {
        return (length * width) / 2;
    }
}
