import java.util.Scanner;

class Area{
    double length;
    double breadth;
    Scanner scanner = new Scanner(System.in);

    void setDim(){
        System.out.print("Enter Length of the Rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter Breadth of the Rectangle: ");
        breadth = scanner.nextDouble();

        scanner.close();
    }

   double getArea(){
       return(length*breadth);
   }
}

public class Rectangle{
    public static void main(String[] args){
        Area rectangle = new Area();

        rectangle.setDim();
        System.out.println("Area of the Rectangle is : " + rectangle.getArea());

    }
}
