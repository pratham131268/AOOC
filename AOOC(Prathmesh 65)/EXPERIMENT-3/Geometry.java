abstract class Shape{
    double dim1;
    double dim2;
    
    Shape(double d1,double d2){
        dim1 = d1;
        dim2 = d2;
    }

    abstract double area();

}

class Rectangle extends Shape{
    Rectangle(double d1, double d2){
        super(d1,d2);
    }

    double area(){
        return(dim1 * dim2);
    }

}

class Triangle extends Shape{
    Triangle(double d1, double d2){
        super(d1,d2);
    }

    double area(){
        return(0.5*(dim1 * dim2));
    }
}

public class Geometry{
    public static void main(String[] args){
        Shape rectangle = new Rectangle(4,4); //length and breadth here
        Shape triangle = new Triangle(6,6); //height and base here

        System.out.println("Area of the Rectangle : " + rectangle.area());
        System.out.println("Area of the Triangle: " + triangle.area());


    }


}
