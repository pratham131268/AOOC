import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageViewer extends JFrame implements ItemListener{
    JComboBox<String> imageList;
    JLabel imageLabel;

    public ImageViewer(){
        setTitle("Flower Images");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        imageList = new JComboBox<>();
        imageList.addItem("Rose");
        imageList.addItem("Lotus");

        imageList.addItemListener(this);
        add(imageList);

        imageLabel = new JLabel();
        add(imageLabel);

        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange() == ItemEvent.SELECTED){
            String selected = (String) e.getItem();
            ImageIcon icon = new ImageIcon(selected + ".jpg");
            imageLabel.setIcon(icon);
        }
    }
    public static void main(String[] args){
        new ImageViewer();
    }
}
