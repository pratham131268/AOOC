import java.io.*;
import java.util.Scanner;

public class Student{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String filename = "student_info.dat";

        System.out.println("Enter Student Details");

        System.out.print("Student name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("height (in cm): ");
        int height = scanner.nextInt();
        scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("phone number: ");
        String ph_no = scanner.nextLine();

        try{
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(weight);
            dos.writeInt(height);
            dos.writeUTF(city);
            dos.writeUTF(ph_no);
            
            System.out.println("Data Written Sucessfully to " + filename);
            dos.close();
        }catch(IOException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }

    

        try{
            DataInputStream ios = new DataInputStream(new FileInputStream(filename));

            System.out.println("Name of the Student: " + ios.readUTF());
            System.out.println("Age: " + ios.readInt());
            System.out.println("Weight: " + ios.readDouble());
            System.out.println("Height: " + ios.readInt());
            System.out.println("City: " + ios.readUTF());
            System.out.println("ph_no: " + ios.readUTF());
            ios.close();
            
        }catch(IOException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
}
