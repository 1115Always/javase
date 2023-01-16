package concurrency;

public class DemoThread implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (!Thread.interrupted()) {
            i++;
        }
        System.out.println(i);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new DemoThread());
        thread.start();
        Thread.sleep(1);
        thread.interrupt();
    }
}
