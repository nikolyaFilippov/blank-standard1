package by.blank.model.dao.user;

import by.blank.model.db.ConnectionManager;
import by.blank.model.entities.user.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static by.blank.constants.DbConstansts.*;

public class UserDao {
    private static UserDao dao;

    public UserDao() {
        ConnectionManager.init();
    }
    public static UserDao getInstance(){
        return dao == null ? new UserDao():dao;
    }
    public User getUser(String login, String password){
        try (Connection cn = ConnectionManager.getConnection();
             PreparedStatement ps = cn.prepareStatement(SELECT_USER)){
            ps.setString(1, login);
            ps.setString(1, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                int id = rs.getInt(ID_COL);
                String name = rs.getNString(NAME_COL);
                String email = rs.getNString(EMAIL_COL);
                return new User(id, login, name, email);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean addUser(User user, String password){
        return true;
    }
}
