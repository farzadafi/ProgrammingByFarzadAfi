package ir.farzadafi;

import ir.farzadafi.model.User;
import ir.farzadafi.model.enumeration.OrderType;
import ir.farzadafi.service.UserService;
import ir.farzadafi.utility.DynamicArray;

import java.sql.SQLException;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
        //insert
//        User user = new User("test", 26, "Arman", "aA1!45435");
//        System.out.println(userService.register(user));

        //login
//        System.out.println(userService.login("farzad", "aA1!45435"));

        //update
//        int i = userService.updateName("farzad", "farzadAfshar");
//        if(i == -1)
//            System.out.println("cant find username");
//        else
//            System.out.println("update OK!");

        //remove
//        int i = userService.removeByUsername("farzad");
//        if(i == -1)
//            System.out.println("cant find for remove");
//        else
//            System.out.println("remove OK!");

        //findAll
        System.out.println("find all is:");
        DynamicArray allUser = userService.findAllUser();
        for (int i = 0; i < allUser.getSize(); i++) {
            System.out.println(allUser.getByIndex(i));
        }
        System.out.println();

        //find all with sort
        System.out.println("find all by order is:");
        DynamicArray allUserByOrder = userService.findAllUserAndOrderBy(OrderType.DESC);
        for (int i = 0; i < allUserByOrder.getSize(); i++) {
            System.out.println(allUserByOrder.getByIndex(i));
        }
    }

}
