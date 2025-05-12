import java.sql.*;

public class DisplayStudents {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "root", "your_password");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM student");
while (rs.next()) {
System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
}
con.close();
}
}