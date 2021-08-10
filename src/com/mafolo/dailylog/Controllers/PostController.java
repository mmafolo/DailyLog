package com.mafolo.dailylog.Controllers;

import com.mafolo.dailylog.dao.PostDao;
import com.mafolo.dailylog.dao.PostDaoImp;
import com.mafolo.dailylog.model.Post;
import com.mafolo.dailylog.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.sql.Date;

@WebServlet("/createPost")
public class PostController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException{
        System.out.println("doGet Method");
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String submit = request.getParameter("submit");
        if(submit.equals("Add a Post")){
            showPostform(request,response);
        }else if(submit.equals("Post")) {
            System.out.println("Post Added");
            createPost(request, response);
        }

    }

    public void showPostform(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException{
        request.getRequestDispatcher("post.jsp").
                forward(request, response);
    }
    protected void createPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException{
        PostDao postDao = new PostDaoImp();
        User user = new User();
        Date date = new Date(System.currentTimeMillis());
        String postTopic = request.getParameter("msgtopc");
        String postBody = request.getParameter("msgbody");
        Post post = new Post(user.getUserName(), date,postTopic,postBody);
        postDao.inserPost(post);
        request.getRequestDispatcher("index.jsp").
                forward(request, response);
    }
}
