package oop.dog;

public class Dog {
    String name;
    String breed;
    int speed;

    public void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "run";

            if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
            System.out.println(result);
        }
    }

    public String info() {
        return "Кличка: " + name + " Порода: " + breed + " Скорость " + speed;
    }
}
