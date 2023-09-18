package by.blank.controllers.user;

import by.blank.controllers.AbstractController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static by.blank.constants.AppConstants.LOGIN_CONTROLLER;
import static by.blank.constants.JspConstants.LOGIN_PARAM;
import static by.blank.constants.JspConstants.PASS_PARAM;

@WebServlet(name = "loginController", urlPatterns = LOGIN_CONTROLLER)
public class LoginController extends AbstractController {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String login = req.getParameter(LOGIN_PARAM);
       String password = req.getParameter(PASS_PARAM);
    }
}
