package by.blank.model.dao.user;

import by.blank.model.db.ConnectionManager;
import by.blank.model.entities.user.User;

public class UserDao {
    private static UserDao dao;

    public UserDao() {
        ConnectionManager.init();
    }
    public static UserDao getInstance(){
        return dao == null ? new UserDao():dao;
    }
    public User getUser(String login, String password){
        return null;
    }
    public boolean addUser(User user, String password){
        return true;
    }
}
