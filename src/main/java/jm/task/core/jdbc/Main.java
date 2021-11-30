package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Egor", "Petrov", (byte) 23);
        userService.saveUser("Petr", "Sidorov", (byte) 24);
        userService.saveUser("Oleg", "Barkov", (byte) 25);
        userService.saveUser("Stepan", "Ivanov", (byte) 26);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
