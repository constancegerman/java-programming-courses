package syntax.loops;

public class ForLoop {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }

//        for (int i = 1000; i > 0; i--) {
//            if (i % 3 == 0) {
//                System.out.println("Division on 3: " + i);
//            }
//        }

        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println("Division on 5: " + i);
            }
        }
    }
}
