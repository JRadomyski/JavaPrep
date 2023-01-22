package que;

public class MyQueue {
    private String[] queue;
    public MyQueue(){
        this.queue = new String[0];
    }
    void put(String element){
        String[] temp = this.queue;
        this.queue = new String[this.queue.length + 1];
        this.queue[0] = element;
        for(int i = 0; i < temp.length; i++){
            this.queue[i+1] = temp[i];
        }
    }
    public String get(){
        String[] temp = this.queue;
        String wynik = temp[temp.length-1];
        this.queue = new String[this.queue.length-1];
        for(int i =0; i<temp.length-1; i++){
            this.queue[i] = temp[i];
        }
        return wynik;
    }
}

