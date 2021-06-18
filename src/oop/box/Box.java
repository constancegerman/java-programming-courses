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

    Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    void setDimensions(double w, double h, double l) {
        this.width = w;
        this.height = h;
        this.length = l;
    }

    public double volume() {
        return width * height * length;
    }

    void showVolume() {
        System.out.println(volume());
    }
}
