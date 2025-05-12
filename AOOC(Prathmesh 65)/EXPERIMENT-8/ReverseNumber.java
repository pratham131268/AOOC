import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumber extends JFrame implements ActionListener{
        private JTextField resultField,inputField;
        private JButton reverseButton;
        
        public ReverseNumber(){
            setTitle("Reverse Number");
            setSize(500,500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            add(new JLabel("Enter Number"));
            
            inputField = new JTextField(5);
            add(inputField);
            
            reverseButton = new JButton("Reverse");
            add(reverseButton);
            
            add(new JLabel("Reversed"));

            resultField = new JTextField(9);
            resultField.setEditable(false);
            add(resultField);

            reverseButton.addActionListener(this);
            setVisible(true);
       }

       public void actionPerformed(ActionEvent e){
             try{
                int num =Integer.parseInt(inputField.getText());
                int rev = 0;
                while(num > 0){
                    int digit = num % 10;
                    rev = rev * 10 + digit;
                    num = num / 10;
                
                    }
                    resultField.setText(String.valueOf(rev));
        }catch(NumberFormatException ex){
            resultField.setText("Invalid Input");
        }
    }

       public static void main(String[] args){
           new ReverseNumber();
       }
}