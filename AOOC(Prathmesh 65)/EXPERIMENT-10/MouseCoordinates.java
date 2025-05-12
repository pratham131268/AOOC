import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseCoordinates extends JFrame implements MouseMotionListener{
    JLabel label;

   public MouseCoordinates(){
        setTitle("Mouse Cordinates");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Mouse mouse inside the window.");
        label.setFont(new Font("ariel", Font.BOLD, 19));
        add(label);

        addMouseMotionListener(this);

        setVisible(true);
   }

   public void mouseMoved(MouseEvent e){
       label.setText("Mouse is moved. at X: " + e.getX() + ", Y: " + e.getY());
   }

   public void mouseDragged(MouseEvent e){
       label.setText("Mouse is moved. at X: " + e.getX() + ", Y: " + e.getY());
   }

   public static void main(String[] args){
       new MouseCoordinates();
   }
}
