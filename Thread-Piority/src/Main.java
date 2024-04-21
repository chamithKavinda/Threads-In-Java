public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            for (int i=1;i<5;i++){
                System.out.println("Thread One  :");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i=1;i<5;i++){
                System.out.println("Thread Two  :");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setName("thread");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getName());

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Bye!!!!!");



    }
}