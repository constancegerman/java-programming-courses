package oop.manhomework;

public class ManApp {
    public static void main(String[] args) {
        String str = "This is Ivan, he is 34 years old, his height is 166.3 cm. Profession - programmer.";
        String n = str.substring(8, 12);
        String a = str.substring(20, 22);
        int a1 = Integer.parseInt(a);
        String h = str.substring(48, 53);
        double h1 = Double.parseDouble(h);
        String p = str.substring(71, 81);
        System.out.println(n + "\n" + a + "\n" + h + "\n" + p);

        Man man = new Man(n, p, a1, h1);
        System.out.println(man.getName() + " is a " + man.getProfession() + ", he is " + man.getAge() + " years old. His height is " + man.getHeight() + " cm.");

    }
}
