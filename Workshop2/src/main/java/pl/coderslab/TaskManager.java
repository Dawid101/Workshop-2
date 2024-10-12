package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

public class TaskManager {
    public static void main(String[] args) {

        User user1=new User();
        user1.setUserName("dawid1234");
        user1.setPassword("user1234");
        user1.setEmail("dawid010@gmail.com");

        UserDao userDao=new UserDao();
        userDao.create(user1);
    }
}
