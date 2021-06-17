package syntax.arrays;

public class HundredArray {
    public static void main(String[] args) {
        int[] numbs = new int[100];
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = i * 10;
        }
//        for (int i = 0; i < numbs.length; i++) {
//            System.out.println(numbs[i]);
//        }

        for (int i: numbs) {
            System.out.println(i);
        }

        char[] chars = new char[10];
        for (char ch: chars) {
            System.out.println(ch);
        }
    }
}
