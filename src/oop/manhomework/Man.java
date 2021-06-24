package oop.manhomework;

public class Man {
    private String name;
    private String profession;
    private int age;
    private double height;

    public Man(String name, String profession, int age, double height) {
        this.name = name;
        this.profession = profession;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
