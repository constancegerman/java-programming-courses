package syntax.integer;

public class Seconds {
    public static void main(String[] args) {
        int seconds = 86400;
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        System.out.println("Получено значение секунд: " + seconds + ", это " + days + " дней, " + hours + " часов, "
                        + minutes + " минут, " + seconds + " секунд.");
    }
}
