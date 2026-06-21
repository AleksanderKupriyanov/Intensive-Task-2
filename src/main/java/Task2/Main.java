package Task2;


import Task2.models.User;
import Task2.services.UserService;

public class Main {
    static void main() {

        UserService userService = new UserService();
        userService.saveUser(new User("Nikita", "fdgdfg@sddg.ru", 25, "15.12.2026"));
        System.out.println(userService.findAllUsers());
    }
}