import java.util.Scanner;

public class IntegerStack implements Stack{
    int size;
    int arr[];
    int top;
    int element;
    public static Scanner scanner = new Scanner(System.in);
    IntegerStack(int s){
        size = s;
        arr = new int[s];
        top = -1;
    }
       
    public void push(){
        if(overflow()){
            System.out.println("Error PUSH(): Stack is Overflow.");
            return;
        }
        System.out.print("Enter Element for PUSH: ");
        element = scanner.nextInt();
        arr[++top] = element;
    }

    public int pop(){
        if(underflow()){
            System.out.println("Error POP: Stack is Underflow");
            return 0;   
        }else
            return(arr[top--]);
    }
    
    public boolean overflow(){
        return(top == size - 1);
    }

    public boolean underflow(){
        return(top == -1);
    }
    public void display(){
        if(underflow()){
            System.out.println("Error Display(): Stack is Underflow");
            return;
        }

        System.out.print("[START]->");
        for(int i = top; i >= 0; i--)
            System.out.printf("[%d]->",arr[i]);

        System.out.printf("[END]\n");
    }
}
