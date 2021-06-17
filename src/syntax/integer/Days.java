package syntax.integer;

public class Days {
    public static void main(String[] args) {
        int days = 365;
        int years = days / 365;
        int months = (days % 365) / 31;
        int leftDays = days - years * 365 - months * 31;
        System.out.println("Общее количество дней: " + days);
        System.out.println("Лет: " + years);
        System.out.println("Месяцев: " + months);
        System.out.println("Дней: " + leftDays);
    }
}
