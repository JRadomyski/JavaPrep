package ThreadsYTTutorials.FirstThread;

public class Threads {
    public static void main(String[] args) {
//        Thread.currentThread().setName("Main Thread");
////        System.out.println(Thread.activeCount());
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setPriority(10);

//        System.out.println(Thread.currentThread().getPriority());

//        System.out.println(Thread.currentThread().isAlive());
//        for(int i = 0; i <= 3; i++){
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }

        MyThread thread2 = new MyThread();
        thread2.start();
        System.out.println(thread2.isAlive());
        thread2.setName("2nd Thread");
        System.out.println(thread2.getName());
    }
}
