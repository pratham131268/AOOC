package ExceptionHandlingDemo;

public class Calculator{
    public void divide(int a, int b) throws DivisionException{
        if(b == 0)
            throw new DivisionException("Quotient is Zero");
        else
            System.out.println("Result is: " + a/b);
    }
}
