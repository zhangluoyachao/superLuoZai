package com.sc.filter;

import javax.servlet.*;
import java.io.IOException;


public class EncodingFilter implements Filter {
    private String respValue;
    private String reqValue;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("编码过滤器初始化");
        reqValue = filterConfig.getInitParameter("req");
        respValue = filterConfig.getInitParameter("resp");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器处理请求");

        //1.实现过滤规则
        servletRequest.setCharacterEncoding(reqValue);
        servletResponse.setContentType(respValue);

        //2.满足要求放行
        //通过filterChain中的 doFilter放行
        //一定要放行，要不然所有请求就会被拦截 停止在当前页面
        filterChain.doFilter(servletRequest, servletResponse);

        //放行后 如果有其他过滤器再经过其他过滤器
        //全部过滤后才会访问web资源
        //3.不满足 可以跳转
        //转换为子类调用方法
//
//        HttpServletResponse resp = (HttpServletResponse) servletResponse;
//        resp.sendRedirect("index.jsp");
    }

    @Override
    public void destroy() {
        System.out.println("销毁过滤器");
    }
}
