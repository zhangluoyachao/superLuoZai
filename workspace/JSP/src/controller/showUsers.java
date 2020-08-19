package controller;

import com.google.gson.Gson;
import pojo.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/showUsers")
public class showUsers extends HttpServlet {
    UserService us = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pre = req.getParameter("pre");
        if (pre == null)
            show(req, resp);
        else if ("ajaxShow".equals(pre))
            ajaxShow(req, resp);
    }

    private void ajaxShow(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        Integer pageIndex = Integer.parseInt(req.getParameter("pageIndex"));
        List<User> list = us.query(pageIndex);
        //转JSON
        Gson gson = new Gson();
        out.print(gson.toJson(list));
    }

    private void show(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String getPageIndex = req.getParameter("pageIndex");
        Integer pageIndex = 1;
        if (getPageIndex != null)
            pageIndex = Integer.parseInt(getPageIndex);

        List<User> list = us.query(pageIndex);
        req.setAttribute("list", list);
        req.getRequestDispatcher("/day8/test.jsp").forward(req, resp);
    }
}
