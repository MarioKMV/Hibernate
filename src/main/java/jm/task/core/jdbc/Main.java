package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.testConnection();
        // Выбираем, использовать ли Hibernate или JDBC (true для Hibernate, false для JDBC)
        UserService userService = new UserServiceImpl ( true );
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 5);
        userService.saveUser("Vanya", "Ivanov", (byte) 30);
        userService.getAllUsers();
        userService.removeUserById(2);
        userService.getAllUsers();
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
    }
}
