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

@WebServlet("/register")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1l;
    private UserDao userDao;

    public void init(){
        userDao = new UserDaoImp();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException{
        register(request, response);
    }
    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException{
        register(request, response);
    }*/
    public void register(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException{
        User user = new User();
        String firstNme = request.getParameter("name");
        String lastName = request.getParameter("usersurname");
        String userName = request.getParameter("username");
        String password = request.getParameter("userpass1");
        String password1 = request.getParameter("userpass2");

        if(password.equals(password1)){
            user.setName(request.getParameter("name"));
            user.setUserName(userName);
            user.setuserPass(password);
            user.setUserSurname(request.getParameter("usersurname"));
            boolean userCreated = userDao.insertUser(user);
            if(userCreated == true) {
                request.setAttribute("message",user.getName());
                request.getRequestDispatcher("index.jsp").forward(request, response);
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
            }

        }else {
            request.setAttribute("message","Please Make sure your passwords are similar");
            request.getRequestDispatcher("registration.jsp").forward(request, response);
        }
    }
}
