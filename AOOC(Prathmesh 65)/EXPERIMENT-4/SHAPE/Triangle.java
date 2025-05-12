public class Triangle implements Shape{
    double base, height;

    Triangle(double b, double h){
        base = b;
        height = h;
    }

   public double area(){
        return(0.5*(base * height));
    }

}
