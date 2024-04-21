public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread One : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread Two : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        t1.start();

    }
}