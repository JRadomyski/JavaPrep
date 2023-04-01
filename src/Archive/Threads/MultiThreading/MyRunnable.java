package Archive.Threads.MultiThreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Drugi Wątek!");
    }

}
