class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main2 {
    public static void main(String[] args){
        //create a instance of Runnable
        MyRunnable runnable = new MyRunnable();

        //create a instance of Thread
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
