package com.sc.controller;

import com.sc.pojo.Users;
import com.sc.service.UsersService;
import com.sc.service.impl.UserServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class doUsersServlet extends HttpServlet {
    private UsersService us = new UserServiceImpl();
    private String base;

    @Override
    public void init(ServletConfig config) throws ServletException {
        base = config.getServletContext().getContextPath();
        config.getServletContext().setAttribute("base", base);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pre = req.getParameter("pre");
        if ("login".equals(pre))
            login(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");


        Users u = us.login(uname, upwd);
        if (u != null) {
            req.getSession().setAttribute("user", u);
            resp.sendRedirect(base + "/doNewsServlet");
        } else resp.sendRedirect(base + "/index.jsp");
    }

}
