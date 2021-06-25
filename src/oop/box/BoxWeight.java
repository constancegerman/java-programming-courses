package oop.box;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight() {
        super();
        this.weight = 0;
    }

    public BoxWeight(double wi, double h, double l, double we) {
        super(wi, h, l);
        this.weight = we;
    }

    public BoxWeight(double size, double we) {
        super(size);
        this.weight = we;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight + ".");
    }
}
