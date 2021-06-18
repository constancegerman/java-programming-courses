package oop.box;

public class Main {
    public static void main(String[] args) {
//        Box myBox = new Box();
//        myBox.height = 10.2;
//        myBox.length = 15;
//        myBox.width = 11.3;
//        Box box2 = new Box();
//        Box box3 = new Box();
//        box2.width = 5;
//        box2.length = 5;
//        box2.height = 5;
//        box3.width = 10;
//        box3.length = 10;
//        box3.height = 10;
//        double volume = myBox.height * myBox.length * myBox.width;
//        double volume2 = box2.height * box2.length * box2.width;
//        double volume3 = box3.height * box3.length * box3.width;
//        System.out.println("Volume 1 is: " + volume + "\nVolume 2 is: " + volume2 + "\nVolume 3 is: " + volume3);

//        Box b1 = new Box();
//        Box b2 = new Box();
//        b1.length = 5;
//        b1.height = 5;
//        b1.width = 5;
//        b2.length = 10;
//        b2.height = 10;
//        b2.width = 10;
//
//        double volume1 = b1.volume();
//        double volume2 = b2.volume();
//        System.out.println(volume1 + "\n" + volume2);

//        Box b = new Box();
//        b.setDimensions(15, 15, 15);
//        System.out.println("Volume is: " + b.volume());

//        Box b = new Box(10, 15,20);
//        System.out.println(b.volume());
//        Box b2 = new Box(5, 15, 20);
//        System.out.println(b2.volume());

        Box box = new Box(10);
        Box box2 = new Box(15, 20, 25);
        Box box3 = new Box();
        box.showVolume();
        box2.showVolume();
        box3.showVolume();
    }
}
