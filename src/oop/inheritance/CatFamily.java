package oop.inheritance;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void showInfo() {
        System.out.println("Quantity of ears: " + ears + ", quantity of legs: " + legs + ", and bigClaws is: " + bigClaws);
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public void eat() {
        System.out.println("Just eat a!");
    }
}
