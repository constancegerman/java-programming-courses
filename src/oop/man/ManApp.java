package oop.man;

public class ManApp {
    public static void main(String[] args) {
        Man man = new Man("Yury", 34);
        System.out.println(man.getAge());
        man.showInfo();
    }
}
