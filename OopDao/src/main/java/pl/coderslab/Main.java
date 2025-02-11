package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("Dawid10");
        user1.setPassword("1234");
        user1.setEmail("dawidson66@interia.com");

        UserDao userDao = new UserDao();

        User user = userDao.read(1);
        user.setUsername("Dawid10");
        user.setPassword("1234");
        user.setEmail("dawidson66@interia.com");
        userDao.update(user);

    }
}