//By Chatgpt

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StationeryPurchase extends JFrame implements ActionListener {
    JCheckBox notebook, pen, pencil;
    JButton order;

    public StationeryPurchase() {
        setLayout(new FlowLayout());
        setTitle("Stationary Purchase System");

        notebook = new JCheckBox("Notebook @ 50");
        pen = new JCheckBox("Pen @ 30");
        pencil = new JCheckBox("Pencil @ 10");
        order = new JButton("Order");

        add(notebook);
        add(pen);
        add(pencil);
        add(order);

        order.addActionListener(this);
        setSize(250, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        String message = "";

        if (notebook.isSelected()) {
            String qty = JOptionPane.showInputDialog(this, "Enter Quantity for Notebook");
            int n = Integer.parseInt(qty);
            total += n * 50;
            message += "Notebook Quantity: " + n + " Total: " + (n * 50) + "\n";
        }

        if (pen.isSelected()) {
            String qty = JOptionPane.showInputDialog(this, "Enter Quantity for Pen");
            int n = Integer.parseInt(qty);
            total += n * 30;
            message += "Pen Quantity: " + n + " Total: " + (n * 30) + "\n";
        }

        if (pencil.isSelected()) {
            String qty = JOptionPane.showInputDialog(this, "Enter Quantity for Pencil");
            int n = Integer.parseInt(qty);
            total += n * 10;
            message += "Pencil Quantity: " + n + " Total: " + (n * 10) + "\n";
        }

        message += "Total: " + total;
        JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(this, "Successfully Ordered.", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new StationeryPurchase();
    }
}

