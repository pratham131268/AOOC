import java.util.Scanner;
import java.lang.Math;

public class Primecheck{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean is_prime = true;
       
        System.out.print("Enter no for Prime check: ");
        num = scanner.nextInt();

        for(int i = 2; i <= Math.sqrt(num); i++)
            if(num % i == 0){
                is_prime = false;
                break;
            }
       
       System.out.println(num + " is prime? " + is_prime);
       scanner.close();
    }
}
