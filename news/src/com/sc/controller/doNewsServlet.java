package com.sc.controller;

import com.sc.pojo.News;
import com.sc.service.NewsService;
import com.sc.service.impl.NewsServiceImpl;
import com.sc.util.Page;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

public class doNewsServlet extends HttpServlet {
    private NewsService ns = new NewsServiceImpl();
    private String base;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext application = config.getServletContext();
        Integer pageIndex = 1;
        Integer pageSize = 5;
        Page<News> page = ns.getPageNews(pageIndex, pageSize);
        application.setAttribute("p", page);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String pre = req.getParameter("pre");
        base = req.getContextPath();
        if (pre == null)
            getNewsList(req, resp);
        else if ("newsAdd".equals(pre))
            newsAdd(req, resp);
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
        String getPointPage = req.getParameter("pointPage");
        if (getPointPage == null)
            req.getRequestDispatcher("newspages/admin.jsp").forward(req, resp);
        else if ("index".equals(getPointPage))
            req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    protected void newsAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer ntid = Integer.parseInt(req.getParameter("ntid"));
        String ntitle = req.getParameter("ntitle");
        String nauthor = req.getParameter("nauthor");
        String nsummary = req.getParameter("nsummary");
        String ncontent = req.getParameter("ncontent");
        String file = req.getParameter("file");

        News news = new News(ntitle, nauthor, nsummary, ncontent, ntid, Date.valueOf(LocalDate.now()), file);
        NewsService ns = new NewsServiceImpl();
        ns.insert(news);

        resp.sendRedirect(base + "/doNewsServlet");
    }
}
