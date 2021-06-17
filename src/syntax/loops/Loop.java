package syntax.loops;

public class Loop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
            if (i == 5)
                break;
        }
        System.out.println();

        for (int j = 1; j <= 100; j++) {
            System.out.println(j);
        }
    }
}
