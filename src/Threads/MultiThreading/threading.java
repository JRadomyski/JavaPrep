package Threads.MultiThreading;

public class threading extends Thread{
    private int threadNum;
    public threading(int threadNum){
        this.threadNum = threadNum;
    }
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i + "    Watek nr:   " + threadNum);
            if(threadNum == 3){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
