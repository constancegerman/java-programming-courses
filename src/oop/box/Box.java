package oop.box;

public class Box {
    double width;
    double height;
    double length;

    Box(double w, double h, double l) {
        this.width = w;
        this.height = h;
        this.length = l;
    }

    void setDimensions(double w, double h, double l) {
        this.width = w;
        this.height = h;
        this.length = l;
    }

    public double volume() {
        return width * height * length;
    }
}
