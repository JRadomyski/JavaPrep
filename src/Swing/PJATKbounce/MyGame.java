package Swing.PJATKbounce;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MyGame extends JPanel implements ActionListener {

    private int x = 0;
    private int y = 0;
    private int dx = 1;
    private int dy = 1;
    public static Image image;

    public MyGame() {
        try {
            // Laduje image (logo pjatk'a)
            image = ImageIO.read(new File("C:/Users/zakub/Desktop/JavaPrep/src/Swing/PJATKbounce/pjatk.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Timer timer = new Timer(7, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, x, y, this); // Rysuje image w JPanel
    }

    public void actionPerformed(ActionEvent e) {
        x += dx;
        y += dy;
        if (x < 0 || x > getWidth() - image.getWidth(this)) {
            dx = -dx;
        }
        if (y < 0 || y > getHeight() - image.getHeight(this)) {
            dy = -dy;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PJATK Bounce");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        Image icon = Toolkit.getDefaultToolkit().getImage(
                "C:/Users/zakub/Desktop/JavaPrep/src/Swing/PJATKbounce/pobrane.png"
        );
        frame.setIconImage(icon);
        MyGame game = new MyGame();
        frame.add(game);
        frame.setVisible(true);
    }
}