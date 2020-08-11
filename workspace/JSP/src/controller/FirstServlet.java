package controller;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet implements Servlet {
    //init方法 表示初始化：可以通过它给Servlet做一些数据初始化的操作
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //获取项目前缀    存入application
        ServletContext application = servletConfig.getServletContext();//application
        String base = application.getContextPath();
        application.setAttribute("base", base);
    }

    //ServletConfig 用于获取Servlet配置信息
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /*
    在服务器运行的Java程序，用于处理请求和响应
    处理用户的请求和响应方法
    ServletRequest子类    HttpServletRequest  request
    ServletResponse子类   HttpServletResponse response

    一般会强制类型转换成子类，调用子类方法
    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletResponse response = (HttpServletResponse) servletResponse;
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //需要配置响应的页面格式
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        //输出    功能类似jsp中的out
        PrintWriter pw = response.getWriter();

        String base = request.getServletContext().getContextPath();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("123")) {
            pw.print("<script>alert('成功');</script>");
        } else pw.print("<script>alert('失败');</script>");
        pw.close();
    }

    //获取信息
    @Override
    public String getServletInfo() {
        return null;
    }

    //用于销毁Servlet
    @Override
    public void destroy() {
        System.out.println("Servlet开始销毁");
    }
}
