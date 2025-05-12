package Ecommerce;

public class Order{
    Product product;
    Customer customer;
    int quantity;

    public Order(Customer c, Product p, int q){
        this.customer = c;
        this.product = p;
        this.quantity = q;
    }

    public void place_order(){
        System.out.println("====Order Placed!====");
        customer.display_customer();
        product.display_product();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost(int RS): " + calculate_cost());
    }

    double calculate_cost(){
        return product.price * quantity;
    }
}
