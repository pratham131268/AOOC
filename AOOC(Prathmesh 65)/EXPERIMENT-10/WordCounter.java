//By Chatgpt

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WordCounter extends JFrame implements KeyListener {
    JTextArea textArea;
    JLabel countLabel;

    public WordCounter() {
        setTitle("Live Word & Character Counter");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

   
        textArea = new JTextArea();
        textArea.addKeyListener(this);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        
        countLabel = new JLabel("Characters: 0 | Words: 0");
        add(countLabel, BorderLayout.SOUTH);

        setVisible(true);
    }


    public void updateCount() {
        String text = textArea.getText();

        int charCount = text.length();
        int wordCount = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;

        countLabel.setText("Characters: " + charCount + " | Words: " + wordCount);
    }

 
    public void keyTyped(KeyEvent e) {
        updateCount();
    }

    public void keyPressed(KeyEvent e) {
        
    }

    public void keyReleased(KeyEvent e) {
        
    }

    public static void main(String[] args) {
        new WordCounter();
    }
}
