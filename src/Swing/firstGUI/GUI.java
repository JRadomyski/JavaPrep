package Swing.firstGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
private int counter = 0;
private JLabel label;
private JFrame frame;
private JPanel panel;
    public GUI() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.setSize(500,300);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Clicky");
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("Number of clicks: " + counter);
    }
}
