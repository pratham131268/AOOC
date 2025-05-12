import MyPackage.ArithmeticOp;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ArithmeticOp ao = new ArithmeticOp();
        Scanner scanner = new Scanner(System.in);
    
        while(true){
            System.out.println("\t\tWelcome To Local Calculator");
            System.out.println("1->Addition\n2->Substraction\n3->Multiplication\n4->Division\n5->exit");

            System.out.print("Please Select Valid Opearation Number: ");
            int op = scanner.nextInt();

            if(op == 5){
                System.out.println("Program Terminated Successfully:");
                System.exit(0);
            }

            if(op < 1|| op > 5){
                System.out.println("Enter Valid Opeartion Number");
                continue;
            }

            System.out.print("Enter First Number: ");
            double x = scanner.nextDouble();

            System.out.print("Enter second Number: ");
            double y = scanner.nextDouble();

            switch(op){
                case 1:
                    System.out.println("Addition is : " + ao.add(x,y));
                    break;
                case 2:
                    System.out.println("Substraction is: " + ao.sub(x,y));
                    break;
                case 3:
                    System.out.println("Multiplication is: " + ao.mul(x,y));
                    break;
                case 4:
                    System.out.println("Divison is : " + ao.div((int)x,(int)y));
                    break;
                
            }
        }
    
    }
}
