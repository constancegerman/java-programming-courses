package syntax.variable;

public class Var {
    public static void main(String[] args) {
        int days = 1000;
        int speed = 300000;
        long seconds = days * 24 * 60 * 60;
        long distance = speed * seconds;
        System.out.println("Distance: " + distance);

        byte a = 126;
        a += 1;
        System.out.println(a);

        byte a1 = 10;
        int b = a1;
        System.out.println(b);

        int a2 = 15;
        byte b2 = (byte)a;
        System.out.println(b);
    }
}
