class  Calculation{
    int num;
    public void increment(){
        num++;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculation cal = new Calculation();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {

                if (cal.num<2000) {
                    cal.increment();
                    System.out.println(cal.num);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                if (cal.num<2000) {
                    cal.increment();
                    System.out.println(cal.num);
                }

            }
        });

        t1.start();
        t2.start();
    }
}