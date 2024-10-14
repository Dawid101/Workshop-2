package pl.coderslab.entity;


import org.mindrot.jbcrypt.BCrypt;
import pl.coderslab.DbUtil;

import java.sql.*;

public class UserDao {
    private static final String CREATE_USER_QUERY =
            "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    ;

    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    public String allUsers() {
        String sqlAllUsers="SELECT * FROM users";
       try(Connection conn = DbUtil.getConnection()){
           PreparedStatement statement=conn.prepareStatement(sqlAllUsers);
           ResultSet resultSet = statement.executeQuery(sqlAllUsers);
           while (resultSet.next()) {
               // Zakładając, że mamy dwie kolumny: id (typu int) i name (typu String)
               int id = resultSet.getInt("id");
               String name = resultSet.getString("username");
               System.out.println("ID: " + id + ", Name: " + name);
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return null;
    }

    public User create(User user) {
        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(CREATE_USER_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getEmail());
            statement.setString(3, hashPassword(user.getPassword()));
            statement.executeUpdate();
            //Pobieramy wstawiony do bazy identyfikator, a następnie ustawiamy id obiektu user.
            ResultSet resultSet = statement.getGeneratedKeys();
//            if (resultSet.next()) {
//                user.setId(resultSet.getInt(1));
//            }
            System.out.println("Użytkownik dodany do bazy");
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public User read(int userId) {
        String sqlRead = "SELECT * FROM users WHERE id = "+userId;
        try(Connection conn=DbUtil.getConnection()){
            PreparedStatement statement = conn.prepareStatement(sqlRead);
            ResultSet resultSet = statement.executeQuery(sqlRead);
            if (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }
            else {
                System.out.println("Brak w bazie użytkowinka o takim ID");
                return null;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    return null;
    }
    public void delete(int userId) {
        String sqlDelete = "DELETE FROM users WHERE id = "+userId;
        try(Connection conn=DbUtil.getConnection()){
            PreparedStatement statement = conn.prepareStatement(sqlDelete);
            int result = statement.executeUpdate(sqlDelete);
            if (result == 1) {
                System.out.println("Użytkownik o podanym ID został usunięty");
            }
            else {
                System.out.println("Brak w bazie użytkowinka o takim ID");

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}

