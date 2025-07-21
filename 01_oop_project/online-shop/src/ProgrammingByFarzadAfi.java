import model.Category;
import model.Customer;
import model.Product;
import model.ShoppingCart;
import model.enumeration.SortType;
import service.CategoryService;
import service.CustomerService;
import service.ProductService;
import service.ShoppingCartService;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        System.out.println("register customer:");
        CustomerService customerService = new CustomerService();
        Customer customer = new Customer("farzad", "test@gmail.com",
                "aA1!sldjkf", "test");
        System.out.println(customerService.register(customer));
        System.out.println("-------------------------------------");

        //return of signIn method
//        System.out.println(customerService.signIn("test@gmial.com", "aA1!sldjk"));
        System.out.println("update address customer");
        customerService.updateAddress("test@gmail.com", "kerman");
        System.out.println("-------------------------------------");

        //category
        System.out.println("add category:");
        Category test = new Category("phone");
        CategoryService categoryService = new CategoryService();
        System.out.println(categoryService.add(test));
        System.out.println("-------------------------------------");

        System.out.println("add products:");
        Product product = new Product("poco", 100, "xi");
        ProductService productService = new ProductService();
        System.out.println(productService.add(product, "phone"));
        Product product1 = new Product("samsung s20", 200, "good");
        Product product2 = new Product("samsung s30", 550, "good");
        System.out.println(productService.add(product2, "phone"));
        System.out.println(productService.add(product1, "phone"));
        System.out.println(productService.findProductByName("poco"));
        System.out.println("-------------------------------------");

        System.out.println("products ASC");
        Product[] test1 = productService.getProductsByCategoryName("phone", SortType.ASC);
        for (int i = 0; i < test1.length; i++) {
            System.out.println(test1[i]);
        }
        System.out.println("-------------------------------------");

        System.out.println("producs DESC");
        Product[] test2 = productService.getProductsByCategoryName("phone", SortType.DESC);
        for (int i = 0; i < test2.length; i++) {
            System.out.println(test2[i]);
        }
        System.out.println("-------------------------------------");

        System.out.println("\n register new shopping cart for customer 1");
        ShoppingCartService shoppingCartService = new ShoppingCartService();
        ShoppingCart shoppingCart = new ShoppingCart(1);
        System.out.println(shoppingCartService.add(shoppingCart));
        System.out.println("-------------------------------------");
    }
}
