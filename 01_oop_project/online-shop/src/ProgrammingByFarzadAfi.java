import model.Customer;
import service.CustomerService;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Customer customer = new Customer("farzad", "test@gmail.com",
                "aA1!sldjkf", "test");
        customerService.register(customer);

        //return of signIn method
//        System.out.println(customerService.signIn("test@gmial.com", "aA1!sldjk"));
        customerService.updateAddress("test@gmail.com", "kerman");
    }
}
