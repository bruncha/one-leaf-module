package olm.users.controller;

import olm.users.dao.UserDao;
import olm.users.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


public class UserController extends HttpServlet {
    UserDao userDao = new UserDao();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<User> users = userDao.getAllUsers();
        request.setAttribute("users", users);

        //转发到Modules/Self-Information/Self-Information
        request.getRequestDispatcher("/Modules/Self-Information/Self-Information.jsp").forward(request, response);
    }
}
