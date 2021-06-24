package oop.box;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double w, double h, double l) {
        this.width = w;
        this.height = h;
        this.length = l;
    }

    public Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    public Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    public void setDimensions(double w, double h, double l) {
        this.width = w;
        this.height = h;
        this.length = l;
    }

    public Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }

    public double volume() {
        return width * height * length;
    }

    public void showVolume() {
        System.out.println(volume());
    }

    public int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;

        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
           result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
