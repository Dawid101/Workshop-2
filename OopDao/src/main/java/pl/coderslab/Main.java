package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("Olcia19");
        user1.setPassword("1234");
        user1.setEmail("olcia19@gmail.com");

        UserDao userDao = new UserDao();
        System.out.println(userDao.read(3).toString());
    }
}