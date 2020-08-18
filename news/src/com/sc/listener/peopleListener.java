package com.sc.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class peopleListener implements HttpSessionListener {
    //通过监听器统计客户端的在线人数


    @Override
    public void sessionCreated(HttpSessionEvent event) {
        //用户第一次发送请求
        ServletContext application = event.getSession().getServletContext();
        Integer count = (Integer) application.getAttribute("count");

        if (count == null)
            count = 1;
        else
            count++;

        application.setAttribute("count", count);
        System.out.println(count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        //session关闭
        ServletContext application = event.getSession().getServletContext();
        Integer count = (Integer) application.getAttribute("count");
        count--;
        application.setAttribute("count", count);
        System.out.println(count);
    }
}
