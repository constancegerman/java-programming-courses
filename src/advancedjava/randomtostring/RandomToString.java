package advancedjava.randomtostring;

public class RandomToString {
    public static void main(String[] args) {

        // Example Random - toString
//        int result = (int) (Math.random() * 6 + 1);
//        System.out.println(result);

        int rand = (int) (Math.random() * 90 + 10);

        String result = String.format("Result is: %s", rand);
        System.out.println(result);
    }
}
