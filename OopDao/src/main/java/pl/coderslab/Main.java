package pl.coderslab;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try(Connection conn = DbUtil.getConnection()){
            System.out.println("Connected to database");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}