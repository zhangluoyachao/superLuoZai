package com.sc.controller;

import com.sc.pojo.Users;
import com.sc.service.UsersService;
import com.sc.service.impl.UserServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

@MultipartConfig
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
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String pre = req.getParameter("pre");
        if ("login".equals(pre))
            login(req, resp);
        else if ("register".equals(pre))
            register(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");

        Users u = us.login(uname, upwd);

        if (u != null) {
            req.getSession().setAttribute("user", u);
            resp.sendRedirect(base + "/doNewsServlet");
        } else resp.sendRedirect(base + "/index.jsp");
    }

    protected void register(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //通过请求获取数据
        String un = req.getParameter("un");
        String pwd = req.getParameter("pwd");
        Part profile = req.getPart("profile");
        //做判断 如果用户名重复返回

        if (us.isExist(un)) {
            PrintWriter out = resp.getWriter();
            out.print("<script>alert('用户名重复！请重新输入！');location.href='" + base + "/newspages/register.jsp';</script>");
            out.close();
        } else {
            //文件保存
            //获取一个新的文件名
            String newFileName = null;
            String fileName = profile.getSubmittedFileName();
            if (!"".equals(fileName)) {
                String suffix = fileName.substring(fileName.lastIndexOf("."));
                newFileName = UUID.randomUUID().toString() + suffix;

                //获取文件存放地址
                String filePath = req.getServletContext().getRealPath("/upload") + File.separator + newFileName;
                //通过流写入
                File f = new File(req.getServletContext().getRealPath("/upload"));
                if (!f.exists())
                    f.mkdir();

                profile.write(filePath);
            }

            //存入数据库
            Users users = new Users(un, pwd, newFileName);
            us.add(users);

            resp.sendRedirect(base + "/index.jsp");
        }
    }
}
