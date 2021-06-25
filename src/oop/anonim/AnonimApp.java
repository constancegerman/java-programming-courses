package oop.anonim;

public class AnonimApp {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("I'm just cooking right now!");
            }
        });
    }
}
