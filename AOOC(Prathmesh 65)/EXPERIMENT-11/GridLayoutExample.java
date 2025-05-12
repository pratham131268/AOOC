import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutExample extends JFrame implements ActionListener {
    JButton[] buttons = new JButton[6];

    public GridLayoutExample() {
        setTitle("GridLayout Example");
        setLayout(new GridLayout(2, 3));
        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        String temp = clicked.getText();
        clicked.setText(buttons[0].getText());
        buttons[0].setText(temp);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}

