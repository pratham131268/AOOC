import java.util.Scanner;

public class Stack{
    int arr[];
    int top;
    int capacity;
    int element;
    static Scanner scanner = new Scanner(System.in);

    Stack(int size){
        top = -1;
        capacity = size;
        arr = new int[size];
    }

    boolean isStackFull(){
        return(top == capacity - 1);
    }

    boolean isStackEmpty(){
        return(top == -1);
    }

    void push(){
        if(isStackFull()){
            System.out.println("Stack is Full");
            return;
        }
        System.out.print("Enter number for PUSH(): ");
        element = scanner.nextInt();
        arr[++top] = element;
    }

    int pop(){
        if(isStackEmpty()){
            System.out.println("Stack is Empty");
            return 0;
        }else
            return arr[top--];
    }

    void display(){
        if(isStackEmpty()){
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("[START]->");
        for(int i = top; i >= 0; i--)
            System.out.printf("[%d]->",arr[i]);
        System.out.print("[END]\n");
    }

    public static void main(String[] args){
        System.out.println("\t\tWelcome to STACK Implementation");
        System.out.println("Please Select a number to perfrom operation on Stack");

        Stack stack = new Stack(50);

        while(true){
            System.out.println("1 -> push()\n2 -> pop()\n3 -> display()\n4 -> Exit()");
            System.out.print("Operation no: ");
            int op = scanner.nextInt();

            switch(op){
                case 1:
                    stack.push();
                    break;

                case 2:
                    int popped = stack.pop();
                    if(popped != -1)
                        System.out.println("Popped Element: " + + popped);
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Program Terminated Successfully");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Operation! Try Again");
            }

        }

        
    }
}
