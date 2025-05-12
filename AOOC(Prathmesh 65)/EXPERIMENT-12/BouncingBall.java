//By Chatgpt

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JPanel implements Runnable, MouseListener {
    int x = 50, y = 50, diameter = 30;
    int dx = 3, dy = 3;
    boolean running = false;

    public BouncingBall() {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.WHITE);
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, diameter, diameter);
    }

    public void run() {
        running = true;
        while (running) {
            x += dx;
            y += dy;

            if (x <= 0 || x + diameter >= getWidth()) dx = -dx;
            if (y <= 0 || y + diameter >= getHeight()) dy = -dy;

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void mousePressed(MouseEvent e) {
        if (!running) {
            new Thread(this).start();
        }
    }

    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BouncingBall panel = new BouncingBall();
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

