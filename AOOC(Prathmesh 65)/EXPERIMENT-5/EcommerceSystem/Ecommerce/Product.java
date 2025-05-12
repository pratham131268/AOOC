package Ecommerce;

public class Product{
    String name;
    double price;
    int product_id;

    public Product(String n, double p, int pid){
        name = n;
        price = p;
        product_id = pid;
    }

    public void display_product(){
        System.out.println("-----Product details------");

        System.out.println("Product name: " + name);
        System.out.println("Price(in RS): " + price);
        System.out.println("Product ID: " + product_id);
    }
}
