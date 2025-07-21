import model.Category;
import model.Customer;
import model.Product;
import model.enumeration.SortType;
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
        Category test = new Category("phone");
        CategoryService categoryService = new CategoryService();
        System.out.println(categoryService.add(test));

        Product product = new Product("poco", 100, "xi");
        ProductService productService = new ProductService();
        System.out.println(productService.add(product, "phone"));
        Product product1 = new Product("samsung s20", 200, "good");
        Product product2 = new Product("samsung s30", 550, "good");
        System.out.println(productService.add(product2, "phone"));
        System.out.println(productService.add(product1, "phone"));
        System.out.println(productService.findProductByName("poco"));

        System.out.println("-----------------------------");
        Product[] test1 = productService.getProductsByCategoryName("phone", SortType.ASC);
        for (int i = 0; i < test1.length; i++) {
            System.out.println(test1[i]);
        }

        System.out.println("**********************************");
        Product[] test2 = productService.getProductsByCategoryName("phone", SortType.DESC);
        for (int i = 0; i < test2.length; i++) {
            System.out.println(test2[i]);
        }
    }
}
