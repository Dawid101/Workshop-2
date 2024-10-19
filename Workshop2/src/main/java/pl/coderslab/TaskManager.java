package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

public class TaskManager {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        User user = new User();

//        user.setUserName("Jakub");
//        user.setEmail("kuba1@gmail.com");
//        user.setPassword("1357");
//        userDao.create(user);


//        User read = userDao.read(2);
//        System.out.println(read);


//        User userToUpdate = userDao.read(5);
//        userToUpdate.setUserName("Arkadiusz");
//        userToUpdate.setEmail("bomba@coderslab.pl");
//        userToUpdate.setPassword("haslo");
//        userDao.update(userToUpdate);

//        userDao.delete(9);

//        User[] all = userDao.findAll();
//        for (User u : all) {
//            System.out.println(u);
//        }

    }
}
