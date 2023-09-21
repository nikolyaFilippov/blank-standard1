package by.blank.model.services.user;

import by.blank.model.dao.user.UserDao;
import by.blank.model.entities.user.User;

public class UserService {
    public static UserService service;
    private UserDao dao;

    public UserService(){
        dao = UserDao.getInstance();
    }
    public static UserService getService(){
        return service == null? new UserService():service;
    }
    public User getUser(String login, String password){
      return dao.getUser(login,password);
    }
    public boolean addUser(User user, String password) {
        return dao.addUser(user, password);
    }
}
