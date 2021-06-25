package oop.inheritancefigure;

public class Triangle extends Figure {
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(double size) {
        super(size, size);
        this.c = size;
    }

    @Override
    public double area() {
        double perimeter = (getA() + getB() + c) / 2;
        double area = perimeter * (perimeter - getA()) * (perimeter - getB()) * (perimeter - c);
        return Math.sqrt(area);
    }
}
