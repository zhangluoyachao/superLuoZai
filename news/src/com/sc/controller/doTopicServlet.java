package com.sc.controller;

import com.sc.pojo.Topic;
import com.sc.service.TopicService;
import com.sc.service.impl.TopicServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/doTopicServlet")

public class doTopicServlet extends HttpServlet {
    TopicService ts = new TopicServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String pre = req.getParameter("pre");
        if (pre.equals("add"))
            add(req, resp);
        else if (pre.equals("delete")) delete(req, resp);
        else if (pre.equals("modify")) modify(req, resp);
        else if (pre.equals("queryAll")) queryAll(req, resp);
    }


    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        TopicService ts = new TopicServiceImpl();
        ts.insert(req.getParameter("tname"));
        resp.sendRedirect(req.getContextPath() + "/doTopicServlet?pre=queryAll");
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        int tid = Integer.parseInt(req.getParameter("tid"));
        TopicService ts = new TopicServiceImpl();
        ts.delete(tid);
        resp.sendRedirect(req.getContextPath() + "/doTopicServlet?pre=queryAll");
    }

    protected void modify(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        TopicService ts = new TopicServiceImpl();
        int oldId = Integer.parseInt(req.getParameter("tid"));
        String newName = req.getParameter("tname");
        ts.updateTopicName(oldId, newName);
        resp.sendRedirect(req.getContextPath() + "/doTopicServlet?pre=queryAll");
    }


    protected void queryAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        List<Topic> lt = ts.queryAll();
        req.setAttribute("list", lt);
        req.getRequestDispatcher("/newspages/topic_list.jsp").forward(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

}
