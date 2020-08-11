package controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/abc")
////等价于 servlet 和Servlet mapping标签
////"/abc" 等价于 url-pattern
@WebServlet(
        displayName = "user",//servlet名称
        urlPatterns = "/aaa",//请求地址
        loadOnStartup = 1   //设置服务器启动时是否执行加载

)
public class UserServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post请求会进入该方法
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //get请求会进入该方法
    }
}
