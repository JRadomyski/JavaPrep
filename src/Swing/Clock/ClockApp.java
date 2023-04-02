package Swing.Clock;

import javax.swing.*;
import java.time.LocalDateTime;

public class ClockApp extends JFrame implements Runnable {
    private Thread thread;
    String hour;
    String minutes;
    String seconds;
    JLabel label;

    public ClockApp(){
        label = new JLabel("", JLabel.CENTER);
        label.setBounds(5,5,100,40);
        add(label);
        setSize(200,200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try{
            while(true) {
                LocalDateTime today = LocalDateTime.now();
                hour = "" + today.getHour();
                minutes = String.format("%02d", today.getMinute());
                seconds = String.format("%02d", today.getSecond());

                label.setText(hour + ":" + minutes + ":" + seconds);
                thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClockApp clock = new ClockApp();

    }
}
