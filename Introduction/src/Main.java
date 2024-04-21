class MyThread extends Thread{
    public void run(){
        System.out.println("My First Thread");
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}