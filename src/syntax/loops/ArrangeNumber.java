package syntax.loops;

public class ArrangeNumber {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        while (count <= 100) {
            sum += count;
            count++;
        }
        float result = sum / (float) count;
        System.out.println("Среднее арифметическое: " + result);
    }
}
