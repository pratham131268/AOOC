import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class LoginForm {
public static void main(String[] args) {
JFrame frame = new JFrame("Login Form");
JTextField userField = new JTextField();
JPasswordField passField = new JPasswordField();
JButton registerButton = new JButton("Register");
userField.setBounds(100, 50, 150, 30);
passField.setBounds(100, 100, 150, 30);
registerButton.setBounds(100, 150, 100, 30);
frame.add(userField);
frame.add(passField);
frame.add(registerButton);
registerButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

String username = userField.getText();
String password = new String(passField.getPassword());
try {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "root", "your_password");
PreparedStatement ps = con.prepareStatement("INSERT INTO users(username, password) VALUES(?, ?)");
ps.setString(1, username);
ps.setString(2, password);
ps.executeUpdate();
con.close();
} catch (Exception ex) {
ex.printStackTrace();
}
}
});
frame.setSize(400, 300);
frame.setLayout(null);
frame.setVisible(true);
}
}