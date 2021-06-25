package advancedjava.multithreadshomework;

public class ThreadHomework {

    static boolean winnerPlayer = false;

    public static void main(String[] args) {
        int random = (int) (Math.random() * 1000000000);
        System.out.println("Initial number: " + random);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!winnerPlayer) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                }
            }
        });

        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!winnerPlayer) {
                    int guessNumber = (int) (Math.random() * 1000000000);
                    if (guessNumber == random) {
                        winnerPlayer = true;
                        System.out.println(guessNumber);
                    }
                }
            }
        });
        timer.start();
        player.start();
    }
}