package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

public class TaskManager {
    public static void main(String[] args) {

//        User user1=new User();
//        user1.setUserName("dawid1234");
//        user1.setPassword("user1234");
//        user1.setEmail("dawid010@gmail.com");
//        User user2 = new User();
//        user2.setUserName("dawid010");
//        user2.setPassword("password1");
//        user2.setEmail("dawid010@gmail.com");
//        User user3=new User();
//        user3.setUserName("arek_IT");
//        user3.setPassword("qwe123");
//        user3.setEmail("arooo@gmail.com");


        UserDao userDao=new UserDao();
//        userDao.create(user3);
//        userDao.read(4);
//        userDao.delete(3);
        userDao.allUsers();
    }
}
