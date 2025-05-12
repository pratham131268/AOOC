import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtons extends JFrame implements ActionListener{
    private JRadioButton male,female;
    private JButton submit;
    ButtonGroup gender;
    private JLabel label;

    public RadioButtons(){
            setTitle("RadioButtons");
            setSize(500,500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            male = new JRadioButton("Male");
            female = new JRadioButton("Female");
            submit = new JButton("Submit");

            gender = new ButtonGroup();
            gender.add(male);
            gender.add(female);

            label = new JLabel("Select your Gender");
            
            male.addActionListener(this);
            female.addActionListener(this);
            submit.addActionListener(this);
            
            add(label);
            add(male);
            add(female);
            add(submit);
            setVisible(true);
            
    }

    public void actionPerformed(ActionEvent e){
            if(e.getSource() == submit){
                if(male.isSelected())
                    JOptionPane.showMessageDialog(this, "You selected Male");
                else if(female.isSelected())
                    JOptionPane.showMessageDialog(this,"You Selected Female");
                else
                    JOptionPane.showMessageDialog(this,"Please Selected a gender");
            }

    }

    public static void main(String[] args){
        new RadioButtons();
    }
}
    