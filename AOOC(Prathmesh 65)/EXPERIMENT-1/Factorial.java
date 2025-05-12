import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        int no,factorial = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number for Factorial: ");
        no = scanner.nextInt();

        for(int i = 1; i <= no; i++)
            factorial *= i;

        System.out.println("Factorial of " + no + " is " + factorial);
        scanner.close();
    }
}
