import java.sql.*;
import java.util.Scanner;



public class StudentCRUD {
public static void main(String[] args) throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "root", "your_password");
Statement stmt = con.createStatement();
Scanner sc = new Scanner(System.in);
System.out.println("1. Select 2. Insert 3. Update 4. Delete");
int choice = sc.nextInt();
if (choice == 1) {
ResultSet rs = stmt.executeQuery("SELECT * FROM student");
while (rs.next()) {
System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
}
} else if (choice == 2) {
System.out.println("Enter id, name, course:");
int id = sc.nextInt();


String name = sc.next();
String course = sc.next();
stmt.executeUpdate("INSERT INTO student VALUES(" + id + ", '" + name + "', '" + course + "')");
} else if (choice == 3) {
System.out.println("Enter id to update and new course:");
int id = sc.nextInt();
String course = sc.next();
stmt.executeUpdate("UPDATE student SET course='" + course + "' WHERE id=" + id);
} else if (choice == 4) {
System.out.println("Enter id to delete:");
int id = sc.nextInt();
stmt.executeUpdate("DELETE FROM student WHERE id=" + id);
}
con.close();
}
}