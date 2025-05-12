import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleTimer extends JFrame implements ActionListener{
    JLabel timeLabel;
    JButton startButton, stopButton;
    Timer timer;
    int counter = 0;

    public SimpleTimer(){
        setTitle("Simple timer");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        timeLabel = new JLabel("Time: 0 seconds");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(timeLabel);

        startButton = new JButton("Start");
        startButton.addActionListener(this);
        add(startButton);

        stopButton = new JButton("stop");
        stopButton.addActionListener(this);
        add(stopButton);

        timer = new Timer(1000, new ActionListener(){
                public void actionPerformed(ActionEvent e){
                counter++;
                timeLabel.setText("time: " + counter + " seconds");
                }
                });
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == startButton)
            timer.start();
        else if(e.getSource() == stopButton)
            timer.stop();
    }
    
    public static void main(String[] args){
        new SimpleTimer();
    }
}


