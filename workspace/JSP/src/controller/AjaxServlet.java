package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ajax")
public class AjaxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接受异步请求");
        //做什么？
        // 1、转码
//        req.setCharacterEncoding("utf-8");
//        resp.setContentType("text/html;charset=utf-8");
        // 2、获取数据
        String color = req.getParameter("color");
        String pw = req.getParameter("pw");
        // 3、对数据进行操作
        // 4、和同步请求不同，不能跳转
        //通过流将数据写入客户端
        PrintWriter out = resp.getWriter();
        out.print("时间");
    }


}
