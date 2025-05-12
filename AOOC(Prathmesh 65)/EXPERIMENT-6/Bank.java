import java.util.Scanner;
import java.lang.Exception;

class LowBalanceException extends Exception{
    LowBalanceException(String msg){
        super(msg);
    }
}

class NegativeNumberException extends Exception{
    NegativeNumberException(String msg){
        super(msg);
    }
}

class BankAccount{
   private double balance;
   private String ac_name;
   private String ac_number;
   
   BankAccount(String name, String an){
       balance = 0;
       ac_name = name;
       ac_number = an;
   }

   void balanceEnquiry(){
        System.out.println("Your Account Balance is: " + balance);
   }

   void withdraw(double withdraw_amount) throws LowBalanceException,NegativeNumberException{
       if(balance < withdraw_amount)
           throw new LowBalanceException("Withdrw Fail Please Check Your Account Balance.");
       else if(withdraw_amount < 0)
           throw new NegativeNumberException("Do not Enter Negative Number");
       else{
            balance -= withdraw_amount;
            System.out.println("Withdraw Successfull");
            balanceEnquiry();
       }
   }
   void deposit(double deposit_amount) throws NegativeNumberException{
        if(deposit_amount < 0)
            throw new NegativeNumberException("Do not Enter Negative Number");
        else{
            balance += deposit_amount;

            System.out.println("Deposit Successful");
            balanceEnquiry();
        }
          
   }
   void display(){
       System.out.println("-----Account Info-------");
       System.out.println("Account Name: " + ac_name);
       System.out.println("Account Number: " + ac_number);
       balanceEnquiry();
   }
}

public class Bank{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BankAccount ba = new BankAccount("XYZ","23423");

        System.out.println("Welcome To Bank Application");

       while(true){
        System.out.println("1->AC Info()\n2->withdrw\n3->deposit\n4->balance enquiry\n5->exit");
        System.out.print("Please select option: ");
        int choise = scanner.nextInt();
        
        switch(choise){
            case 1:
                ba.display();
                break;

            case 2:
                System.out.print("Enter Amount for Withdrw: ");
                double amount = scanner.nextDouble();
                try{
                    ba.withdraw(amount);
                }
                catch(LowBalanceException | NegativeNumberException e){
                    System.out.println("Caught Exception: " + e.getMessage());
                }
                break;

             case 3:
                System.out.print("Enter Amount for Deposit: ");
                double deposit_amount = scanner.nextDouble();
                try{
                    ba.deposit(deposit_amount);
                }
                catch(NegativeNumberException e){
                    System.out.println("Caught Exception: " + e.getMessage());
                }
                break;

             case 4:
                ba.balanceEnquiry();
                break;

             case 5:
                scanner.close();
                System.out.println("PROGRAMME TERMINATED SUCCESSFULLY");
                System.exit(0);

            default:
                System.out.println("Please Enter Valid Operation Number");
                break;
        
        }
       }
       
    }

}
