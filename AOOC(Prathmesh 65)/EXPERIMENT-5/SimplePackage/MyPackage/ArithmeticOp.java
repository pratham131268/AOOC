package MyPackage;

public class ArithmeticOp{

    public double add(double a, double b){
        return(a + b);
    }

    public double sub(double a, double b){
        return(b - a);
    }

    public double mul(double a, double b){
        return(a*b);
    }

    public int div(int a, int b){
        if(a == 0 || b == 0){
            System.out.println("Enter Valid number");
            return 0;
        }
        return(a/b);
    }

}
