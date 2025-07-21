import model.Category;
import model.Customer;
import model.Product;
import service.CategoryService;
import service.CustomerService;
import service.ProductService;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Customer customer = new Customer("farzad", "test@gmail.com",
                "aA1!sldjkf", "test");
        customerService.register(customer);

        //return of signIn method
//        System.out.println(customerService.signIn("test@gmial.com", "aA1!sldjk"));
        customerService.updateAddress("test@gmail.com", "kerman");

        //category
        Category test = new Category("test");
        CategoryService categoryService = new CategoryService();
        System.out.println(categoryService.add(test));

        Product product = new Product("test", 200, "good");
        ProductService productService = new ProductService();
        System.out.println(productService.add(product, "test"));
        Product product1 = new Product("test1", 200, "good");
        System.out.println(productService.add(product1, "test"));

        System.out.println(productService.findProductByName("test"));
    }
}
