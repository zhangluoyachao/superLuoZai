package com.sc.filter;

import javax.servlet.*;
import java.io.IOException;


public class EncodingFilter implements Filter {
    private String reqValue;
    private String respValue;

    @Override
    public void init(FilterConfig filterConfig) {
        reqValue = filterConfig.getInitParameter("req");
        respValue = filterConfig.getInitParameter("resp");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(reqValue);
        servletResponse.setContentType(respValue);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
