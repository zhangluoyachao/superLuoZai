package com.sc.controller;

import com.sc.pojo.Topic;
import com.sc.service.TopicService;
import com.sc.service.impl.TopicServiceImpl;
import com.sc.util.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doTopicServlet")

public class doTopicServlet extends HttpServlet {
    private TopicService ts = new TopicServiceImpl();
    private String base;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        base = req.getContextPath();
        String pre = req.getParameter("pre");
        if (pre == null)
            rownumQueryAll(req, resp);
        else if ("add".equals(pre))
            add(req, resp);
        else if ("delete".equals(pre)) delete(req, resp);
        else if ("modify".equals(pre)) modify(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        TopicService ts = new TopicServiceImpl();
        ts.insert(req.getParameter("tname"));
        resp.sendRedirect(base + "/doTopicServlet?pre=rownumQueryAll");
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int tid = Integer.parseInt(req.getParameter("tid"));
        TopicService ts = new TopicServiceImpl();
        ts.delete(tid);
        resp.sendRedirect(base + "/doTopicServlet?pre=rownumQueryAll");
    }

    protected void modify(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        TopicService ts = new TopicServiceImpl();
        int oldId = Integer.parseInt(req.getParameter("tid"));
        String newName = req.getParameter("tname");
        ts.updateTopicName(oldId, newName);
        resp.sendRedirect(base + "/doTopicServlet?pre=rownumQueryAll");
    }


    protected void rownumQueryAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String getPageIndex = req.getParameter("pageIndex");
        String getPageSize = req.getParameter("pageSize");
        Integer pageIndex = 1;
        Integer pageSize = 5;
        if (getPageIndex != null) {
            pageIndex = Integer.parseInt(getPageIndex);
        }
        if (getPageSize != null) {
            pageSize = Integer.parseInt(getPageSize);
        }
        Page<Topic> page = ts.getTopicPage(pageIndex, pageSize);
        req.setAttribute("page", page);
        req.getRequestDispatcher("newspages/topic_list.jsp").forward(req, resp);
    }


}
