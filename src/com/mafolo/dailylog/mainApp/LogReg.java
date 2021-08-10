package com.mafolo.dailylog.mainApp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mafolo.dailylog.dao.UserDao;
import com.mafolo.dailylog.dao.UserDaoImp;
import com.mafolo.dailylog.model.User;


public class LogReg extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException  {
		
		/*UserDao userDao = new UserDaoImp();
		User user = new User();
		String username, pass, submit;
		username = req.getParameter("username");
		pass = req.getParameter("userpass");
		submit = req.getParameter("submit");
		if(submit.equals("login")) {
			user = userDao.getUser(username, pass);
			if(!user.getName().isEmpty()) {
				//sent user to home page
				req.setAttribute("message",user.getName());
				req.getRequestDispatcher("index.jsp").forward(req, res);
				HttpSession session = req.getSession();
				session.setAttribute("user", user);
				
			}
			else {
				//sent page to register
				req.setAttribute("message","Please make sure your details are correct");
				req.getRequestDispatcher("login.jsp").forward(req, res);
			}
		}
		if(submit.equals("register")) {
			if(pass.equals(req.getParameter("userpass2"))) {
				user.setName(req.getParameter("name"));
				user.setUserName(username);
				user.setuserPass(pass);
				user.setUserSurname(req.getParameter("usersurname"));
				boolean userCreated = userDao.insertUser(user);
				if(userCreated == true) {
					req.setAttribute("message",user.getName());
					req.getRequestDispatcher("index.jsp").forward(req, res);
					HttpSession session = req.getSession();
					//session.setAttribute("user", user);
				}
				
			}else {
				req.setAttribute("message","Please Make sure your passwords are similar");
				req.getRequestDispatcher("registration.jsp").forward(req, res);
			}
			
		}*/
		
	}
}
