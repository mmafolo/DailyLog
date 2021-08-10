package com.mafolo.dailylog.mainApp;

import com.mafolo.dailylog.model.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DailyLog extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		
		System.out.println("this is session.toString \n"+ session.toString() + "\n");
		User user = (User) session.getAttribute("user");
		System.out.println("\n\nMe trying to get session values \n"+user.getName() + "\n\n");
		
		
	}
}
