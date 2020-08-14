package com.sc.filter;

import com.sc.pojo.Users;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//登录控制
public class sessionFilter implements Filter {
    String base;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        base = filterConfig.getServletContext().getContextPath();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //实现过滤
        //实现登录控制
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        Users user = (Users) req.getSession().getAttribute("user");

        if (user != null) {
            //放行
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            //跳转
            resp.sendRedirect(base + "/index.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
