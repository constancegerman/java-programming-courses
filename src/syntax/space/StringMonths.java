package syntax.space;

public class StringMonths {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December"};
        String result = "";
        for (int i = 0; i < months.length; i++) {
            result += months[i];
            if (i == months.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.print(result);
    }
}
