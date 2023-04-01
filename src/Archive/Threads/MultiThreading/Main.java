package Archive.Threads.MultiThreading;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Trzeci Wątek!");
            }
        });
        t3.start();

        Thread t4 = new Thread(()-> System.out.println("Czwarty Wątek!"));
        t4.run();


        System.out.println("Metoda Synchronizacyjna");

        Thread synThread1 = new SynThread();
        Thread synThread2 = new SynThread();
        Thread synThread3 = new SynThread();


        synThread1.start();
        synThread2.start();
        synThread3.start();

        try {
            synThread1.join();
            synThread2.join();
            synThread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(SynThread.value);

        System.out.println("Metoda Synchronizacyjna2");

        Thread synThread4 = new SynThread2();
        Thread synThread5 = new SynThread2();
        Thread synThread6 = new SynThread2();


        synThread4.start();
        synThread5.start();
        synThread6.start();

        try {
            synThread4.join();
            synThread5.join();
            synThread6.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(SynThread2.value);
    }
}
