package com.sc.controller;

import com.sc.pojo.News;
import com.sc.service.NewsService;
import com.sc.service.impl.NewsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/doNewsServlet")
public class doNewsServlet extends HttpServlet {
    NewsService ns = new NewsServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pre = req.getParameter("pre");
        if (pre.equals("getNewsList"))
            getNewsList(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }


    protected void getNewsList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<News> list = ns.queryAll();
        req.setCharacterEncoding("utf-8");
        req.setAttribute("list", list);
        req.getRequestDispatcher(req.getContextPath() + "/newspages/admin.jsp").forward(req, resp);
    }
}
