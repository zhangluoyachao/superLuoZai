package com.sc.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    //创建方法
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("application域对象创建");
        //可以做项目启动时实现自定义初始化工作
        ServletContext application = servletContextEvent.getServletContext();
        application.setAttribute("base", application.getContextPath());
        System.out.println("监听器初始化成功");
    }

    //销毁方法
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("application域对象销毁");
        //可以做一些清理工作
    }
}
