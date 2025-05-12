import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI{
        private static int count = 0;
    public static void main(String[] args){
        
        JFrame frame = new JFrame("Counter");
        
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Counter");
        
        JTextField textField  = new JTextField(5);

        textField.setEditable(false);
       
        JButton countUp = new JButton("CountUp");
        JButton countDown = new JButton("CountDown");
        JButton reset = new JButton("Reset");

        countUp.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                        count++;
                        textField.setText(String.valueOf(count));
                        }
                  });

        countDown.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                        count--;
                        textField.setText(String.valueOf(count));
                        }
                  });
        reset.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                        count = 0;
                        textField.setText(String.valueOf(count));
                        }
                  });

       frame.add(label);
       frame.add(textField);
       frame.add(countUp);
       frame.add(countDown);
       frame.add(reset);
       frame.setVisible(true);
    }
}



       
