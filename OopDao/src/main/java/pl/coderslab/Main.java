package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        User user1 = new User();
//        user1.setUsername("dawidson52");
//        user1.setPassword("haslo");
//        user1.setEmail("coderslab@gmail.com");

        UserDao userDao = new UserDao();

//        User user = userDao.read(1);
//        user.setUsername("Dawid10");
//        user.setPassword("1234");
//        user.setEmail("dawidson66@interia.com");
//        userDao.update(user);

//        userDao.delete(3);
//        userDao.create(user1);
        User[] users = userDao.findAll();
        System.out.println(Arrays.toString(users));

    }
}