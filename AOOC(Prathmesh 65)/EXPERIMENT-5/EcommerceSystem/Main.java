import Ecommerce.*;

public class Main{
    public static void main(String[] args){
        Product product = new Product("Key board", 699.9, 2213);
        Customer customer = new Customer("YZ", 5322);

        Order order = new Order(customer,product,2);
        order.place_order();
    }
}
