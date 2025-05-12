import ExceptionHandlingDemo.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();
        int nume,denom;

        System.out.print("Enter Numerator: ");
        nume = scanner.nextInt();

        System.out.print("Enter Denominator: ");
        denom = scanner.nextInt();

        try{
            cal.divide(nume,denom);
        }
        catch(DivisionException e){
            System.out.println(e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
}
