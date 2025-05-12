package Ecommerce;

public class Customer{
    String name;
    int customer_id;

    public Customer(String n, int cid){
        name = n;
        customer_id = cid;
    }

    public void display_customer(){
        System.out.println("-----customer details-------");

        System.out.println("Customer ID: " + customer_id);
        System.out.println("Cusomer Name: "+ name);
    }
}
