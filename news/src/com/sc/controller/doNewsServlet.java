package com.sc.controller;

import com.sc.pojo.News;
import com.sc.service.NewsService;
import com.sc.service.impl.NewsServiceImpl;
import com.sc.util.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doNewsServlet")
public class doNewsServlet extends HttpServlet {
    private NewsService ns = new NewsServiceImpl();
    private String base;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String pre = req.getParameter("pre");
        base = req.getContextPath();
        if (pre == null)
            getNewsList(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }


    protected void getNewsList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String getPageIndex = req.getParameter("pageIndex");
        String getPageSize = req.getParameter("pageSize");
        Integer pageIndex = 1;
        Integer pageSize = 5;
        if (getPageIndex != null)
            pageIndex = Integer.parseInt(getPageIndex);
        if (getPageSize != null)
            pageSize = Integer.parseInt(getPageSize);
        Page<News> page = ns.getPageNews(pageIndex, pageSize);
        req.setAttribute("p", page);
        req.getRequestDispatcher("/newspages/admin.jsp").forward(req, resp);
    }
}
