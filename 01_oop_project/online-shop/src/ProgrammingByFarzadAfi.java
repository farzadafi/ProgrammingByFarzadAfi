import model.*;
import model.enumeration.SortType;
import service.*;

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
        Product product = new Product("poco", 100, "xi", 20);
        ProductService productService = new ProductService();
        System.out.println(productService.add(product, "phone"));
        Product product1 = new Product("samsung s20", 200, "good", 20);
        Product product2 = new Product("samsung s30", 550, "good", 10);
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
        int shoppingCartId = shoppingCartService.add(shoppingCart);
        System.out.println(shoppingCartId);
        System.out.println("-------------------------------------");

        System.out.println("\n add a cart item :)");
        CartItemService cartItemService = new CartItemService();
        CartItem cartItem = new CartItem(shoppingCartId, 1);
        CartItem cartItem1 = new CartItem(shoppingCartId, 2);
        System.out.println(cartItemService.add(cartItem));
        System.out.println(cartItemService.add(cartItem1));

        System.out.println("\n \n print shoppingCart total price");
        System.out.println(shoppingCartService.getTotalPriceForShoppingCart(shoppingCartId));
    }
}
