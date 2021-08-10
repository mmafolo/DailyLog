package com.mafolo.dailylog.Controllers;

import com.mafolo.dailylog.dao.UserDao;
import com.mafolo.dailylog.dao.UserDaoImp;
import com.mafolo.dailylog.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    private UserDao userDao;
    private User user;

    public void init(){
        userDao = new UserDaoImp();
        user = new User();
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("userpass");

        user = userDao.getUser(userName,password);
        System.out.println(user.getName());
        if(user != null){
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            //Create a session
            HttpSession session = request.getSession();
            session.setAttribute("User", user.getUserName());
            System.out.println(user.getName() + " user bobject is not null");
            System.out.println(session);
        }else if(user == null) {
            request.setAttribute("message","Please make sure your details are correct\n" +
                    "Click here to register");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }
    }
}
