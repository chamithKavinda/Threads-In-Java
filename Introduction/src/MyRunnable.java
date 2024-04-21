public class MyRunnable implements Runnable{


    private String name;
    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Start Thread: " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End Thread: " + name);
    }
}