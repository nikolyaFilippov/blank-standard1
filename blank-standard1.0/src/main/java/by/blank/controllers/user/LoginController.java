package by.blank.controllers.user;

import by.blank.controllers.AbstractController;
import by.blank.model.entities.user.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static by.blank.constants.AppConstants.LOGIN_CONTROLLER;
import static by.blank.constants.AppConstants.USER_NOT_FOUND;
import static by.blank.constants.JspConstants.*;

@WebServlet(name = "loginController", urlPatterns = LOGIN_CONTROLLER)
public class LoginController extends AbstractController {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String login = req.getParameter(LOGIN_PARAM);
       String password = req.getParameter(PASS_PARAM);
       User user = userService.getUser(login,password);
       if (user !=null){
           HttpSession session = req.getSession();
           session.setAttribute(USER_ATTR, user);
           forward(req,resp,HOME_JSP);
                  }else {
           forward(req,resp, LOGIN_JSP,USER_NOT_FOUND);
       }
    }
}
