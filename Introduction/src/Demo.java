import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable runnable  = new MyRunnable("workerThread "+i);
            executorService.execute(runnable);
        }


        executorService.shutdown();
        while (executorService.isTerminated()){
        }
        System.out.println("Success");
    }
}