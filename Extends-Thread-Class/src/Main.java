class One extends Thread{
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Thread 1 count" + (i-1));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Two extends Thread{
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Thread 2 count" + (i-1));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread one = new One();
        Thread two = new Two();
        one.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        two.start();
    }
}