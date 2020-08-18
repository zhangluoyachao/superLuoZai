package controller;

import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {
    UserService us = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post请求会进入该方法
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String un = req.getParameter("un");
        PrintWriter out = resp.getWriter();
        out.print(us.checkUserName(un));


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //get请求会进入该方法
        doPost(req, resp);
    }
}
