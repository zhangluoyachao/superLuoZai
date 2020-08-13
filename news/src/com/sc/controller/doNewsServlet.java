package com.sc.controller;

import com.sc.pojo.News;
import com.sc.pojo.Topic;
import com.sc.service.NewsService;
import com.sc.service.TopicService;
import com.sc.service.impl.NewsServiceImpl;
import com.sc.service.impl.TopicServiceImpl;
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
import java.util.List;

public class doNewsServlet extends HttpServlet {
    private NewsService ns = new NewsServiceImpl();
    private TopicService ts = new TopicServiceImpl();
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
            showAllNews(req, resp);
        else if ("newsAdd".equals(pre))
            newsAdd(req, resp);
        else if ("newsDelete".equals(pre))
            newsDelete(req, resp);
        else if ("showNewsByTopic".equals(pre))
            showNewsByTopic(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
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

    protected void newsDelete(HttpServletRequest req, HttpServletResponse resp) {

    }

    protected void showNewsByTopic(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取Topic集合 前8个
        List<Topic> topicList = ts.getForIndex(1, 8);
        //通过TID pageIndex pageSize获取对应主题的Page
        String getTid = req.getParameter("tid");
        String getPageIndex = req.getParameter("pageIndex");
        String getPageSize = req.getParameter("pageSize");
        Integer tid = topicList.get(1).getId();
        Integer pageIndex = 1;
        Integer pageSize = 5;
        if (getTid != null)
            tid = Integer.parseInt(getTid);
        if (getPageIndex != null)
            pageIndex = Integer.parseInt(getPageIndex);
        if (getPageSize != null)
            pageSize = Integer.parseInt(getPageSize);

        Page<News> newsPage = ns.getPageNews(tid, pageIndex, pageSize);

        //设置到req中,转发到前台处理
        req.setAttribute("p", newsPage);
        req.setAttribute("t", topicList);

        req.getRequestDispatcher("/index.jsp").forward(req, resp);

    }

    protected void showAllNews(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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

        req.getRequestDispatcher("newspages/admin.jsp").forward(req, resp);

    }


}
