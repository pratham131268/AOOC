//by Chatgpt

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopwatchApp extends JFrame implements ActionListener {
    JLabel timeLabel;
    JButton startBtn, stopBtn, resetBtn;
    int seconds = 0;
    boolean running = false;
    Thread timerThread;

    public StopwatchApp() {
        setTitle("Stopwatch");
        setLayout(new FlowLayout());
        timeLabel = new JLabel("Time: 0");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));

        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop");
        resetBtn = new JButton("Reset");

        add(timeLabel);
        add(startBtn);
        add(stopBtn);
        add(resetBtn);

        startBtn.addActionListener(this);
        stopBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        setSize(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn) {
            if (!running) {
                running = true;
                timerThread = new Thread(() -> {
                    while (running) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            break;
                        }
                        seconds++;
                        SwingUtilities.invokeLater(() -> timeLabel.setText("Time: " + seconds));
                    }
                });
                timerThread.start();
            }
        } else if (e.getSource() == stopBtn) {
            running = false;
        } else if (e.getSource() == resetBtn) {
            running = false;
            seconds = 0;
            timeLabel.setText("Time: 0");
        }
    }

    public static void main(String[] args) {
        new StopwatchApp();
    }
}

