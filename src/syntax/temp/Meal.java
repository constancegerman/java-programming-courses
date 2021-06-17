package syntax.temp;

public class Meal {
    public static void main(String[] args) {
        int money = 45;

        if (money > 500) {
            System.out.println("Pizza");
        } else if (money >= 300 && money <= 500) {
            System.out.println("Salat");
        } else if (money >= 100 && money < 300) {
            System.out.println("Hamburger");
        } else {
            System.out.println("Something else");
        }
    }
}
