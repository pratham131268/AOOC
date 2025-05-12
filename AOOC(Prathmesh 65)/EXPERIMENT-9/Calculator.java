//By Chatgpt

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField textField;
    double num1, num2, result;
    String operator;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(5, 5));

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(5, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "%", "√", "x²"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.PLAIN, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9]") || cmd.equals(".")) {
            textField.setText(textField.getText() + cmd);
        } else if (cmd.equals("C")) {
            textField.setText("");
            num1 = num2 = 0;
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
                case "%": result = num1 % num2; break;
            }
            textField.setText(String.valueOf(result));
        } else if (cmd.equals("√")) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(Math.sqrt(num1)));
        } else if (cmd.equals("x²")) {
            num1 = Double.parseDouble(textField.getText());
            textField.setText(String.valueOf(num1 * num1));
        } else {
            num1 = Double.parseDouble(textField.getText());
            operator = cmd;
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

