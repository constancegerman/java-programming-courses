package syntax.arrays;

public class DescendingArray {
    public static void main(String[] args) {
        int[] first = new int[900];
        for (int i = 0; i < first.length; i++) {
            first[i] = i + 100;
            System.out.println(first[i]);
        }

        int[] second = new int[first.length];
        for (int i = 0, j = first.length - 1; i < first.length; i++, j--) {
            second[j] = first[i];
        }

        for (int i: second) {
            System.out.println(i);
        }
    }
}
