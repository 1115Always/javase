package concurrency;

public class Exercise1 implements Runnable{

    private static int count = 0;
    private String name;

    public Exercise1() {
        count++;
        name = "Exercise1 thread" + count;
        System.out.println(name + " start");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name +" says " + i + " I'm here as always");
        }
        Thread.yield();
        System.out.println(name + " end");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Exercise1()).start();
        }
    }
}
