
public class Test extends IntegerStack{
    Test(int s){
        super(s);
    }
    public static void main(String[] args){
        Test stack = new Test(50);
        // Scanner scanner = new Scanner(System.in);

        System.out.println("\t\tWelcome to STACK Implementation");
        while(true){
            System.out.println("1->push()\n2->pop()\n3->display\n4->exit");
            System.out.print("Enter Operation Code: ");
            int op = scanner.nextInt();

            switch(op){
                case 1:
                    stack.push();
                    break;
                case 2:
                    int popele = stack.pop();
                    System.out.println("Poped Element: " + popele);
                    break;

               case 3:
                    stack.display();
                    break;

              case 4:
                    System.out.println("PROGRAM TERMINATED SUCCESSFULL");
                    System.exit(0);

              default:
                    System.out.println("Please select valid operation");
            }

        }
        
    }
}
