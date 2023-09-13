package class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyCanvas c = new MyCanvas();
        frame.setSize(1000, 1000);
        frame.add(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyCanvas extends Canvas {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(100, 200, 500, 500);
        g.setColor(Color.BLACK);
        g.fillRect(500,200,300,500);
    }
}