import model.Customer;
import service.CustomerService;

public class ProgrmmingByFarzadAfi {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Customer customer = new Customer("farzad", "test@gmial.com", "aA1!sldjkf", "test");
        customerService.register(customer);
    }
}
