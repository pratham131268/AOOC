import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    public FlowLayoutExample() {
        setTitle("FlowLayout Example");
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        add(new JCheckBox("Java"));
        add(new JCheckBox("Python"));
        add(new JCheckBox("C++"));

        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}

