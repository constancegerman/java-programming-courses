package advancedjava.exceptionshomework;

import java.util.ArrayList;

public class ExceptionsHomework {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }

        for (int num : numbers) {
            System.out.println(num);
        }

        try {
            numbers.remove(12);
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("Out of bounds of an array.");
        } finally {
            System.out.println("It works perfectly.");
        }
        System.out.println("Say hello!");

//        try {
//            int[] array = new int[10];
//            System.out.println(array[25]);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Выход за пределы массива");
//        }
    }
}
