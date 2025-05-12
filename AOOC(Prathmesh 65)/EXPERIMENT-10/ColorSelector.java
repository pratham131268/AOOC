//By Chatgpt

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorSelector extends JFrame implements ItemListener {
    JComboBox<String> colorList;

    public ColorSelector() {
        setTitle("Background Color Selector");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

   
        colorList = new JComboBox<>();
        colorList.addItem("Red");
        colorList.addItem("Green");
        colorList.addItem("Blue");
        colorList.addItem("Yellow");
        colorList.addItem("Orange");
        colorList.addItem("Gray");

        colorList.addItemListener(this); 
        add(colorList);

        setVisible(true);
    }

   
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selectedColor = (String) e.getItem();
            Color bgColor;

            switch (selectedColor) {
                case "Red": bgColor = Color.RED; break;
                case "Green": bgColor = Color.GREEN; break;
                case "Blue": bgColor = Color.BLUE; break;
                case "Yellow": bgColor = Color.YELLOW; break;
                case "Orange": bgColor = Color.ORANGE; break;
                case "Gray": bgColor = Color.GRAY; break;
                default: bgColor = Color.WHITE;
            }

            getContentPane().setBackground(bgColor);
        }
    }

    public static void main(String[] args) {
        new ColorSelector();
    }
}
