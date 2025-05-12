//By Chatgpt

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample extends JFrame implements ActionListener {
    JTextField inputField, resultField;

    public BorderLayoutExample() {
        setTitle("Border Layout Example");
        setLayout(new BorderLayout());

        JPanel top = new JPanel(new FlowLayout());
        top.add(new JLabel("Enter the number"));
        inputField = new JTextField(10);
        top.add(inputField);
        add(top, BorderLayout.NORTH);

        JPanel center = new JPanel(new GridLayout(1, 3));
        JButton binary = new JButton("Binary");
        JButton octal = new JButton("Octal");
        JButton hex = new JButton("Hex");
        binary.addActionListener(this);
        octal.addActionListener(this);
        hex.addActionListener(this);
        center.add(binary);
        center.add(octal);
        center.add(hex);
        add(center, BorderLayout.CENTER);

        JPanel bottom = new JPanel(new FlowLayout());
        bottom.add(new JLabel("Result"));
        resultField = new JTextField(10);
        bottom.add(resultField);
        add(bottom, BorderLayout.SOUTH);

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(inputField.getText());
        String cmd = e.getActionCommand();
        if (cmd.equals("Binary"))
            resultField.setText(Integer.toBinaryString(num));
        else if (cmd.equals("Octal"))
            resultField.setText(Integer.toOctalString(num));
        else if (cmd.equals("Hex"))
            resultField.setText(Integer.toHexString(num));
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}

