import java.util.Scanner;
import java.lang.Exception;

class OddNumberException extends Exception{
    OddNumberException(String msg){
        super(msg);
    }
}

public class OddExcep{
    public static void check_number(int num) throws OddNumberException{
        if(num % 2 != 0)
            throw new OddNumberException("Entered Number is ODD!");
        else
            System.out.println("Entered Number is EVEN");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int number = scanner.nextInt();

        try{
            check_number(number);
        }
        catch(OddNumberException e){
            System.out.println("caught Exception: " + e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
}
