package com.sc.controller;

import com.sc.service.UpvoteUserService;
import com.sc.service.impl.UpvoteUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/upvoteUser")
public class DoUpvoteUserServlet extends HttpServlet {
    String base;
    UpvoteUserService uud = new UpvoteUserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        base = req.getServletContext().getContextPath();
        String pre = req.getParameter("pre");
        if (pre == null)
            ajaxUserExist(req, resp);
    }

    private void ajaxUserExist(HttpServletRequest req, HttpServletResponse resp) {
        String userName = req.getParameter("UserName");
        String videoName = req.getParameter("videoName");
        boolean b = uud.addUpvote(userName, videoName);
        if (b) {
            //跳转
        }
    }
}
