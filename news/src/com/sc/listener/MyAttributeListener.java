package com.sc.listener;

import com.sc.pojo.Users;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyAttributeListener implements HttpSessionAttributeListener {
    SimpleDateFormat smf = new SimpleDateFormat("yyyy-MM-dd HH/mm/ss");

    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        //什么时间 给会话添加属性 属性的类型
        Date d = new Date();
        String time = smf.format(d);
        String name = httpSessionBindingEvent.getName();
        Users value = (Users) httpSessionBindingEvent.getValue();
        //通过反射获取获取类名


        System.out.println(time + "：在session作用域，新增了用户：" + value.getUsername());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        Date d = new Date();
        String time = smf.format(d);
        String name = httpSessionBindingEvent.getName();
        Users value = (Users) httpSessionBindingEvent.getValue();
        //通过反射获取获取类名
        String className = value.getClass().getSimpleName();
        //销毁session
        httpSessionBindingEvent.getSession().invalidate();
        System.out.println(time + "：在session作用域，删除了用户：" + value.getUsername());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        Date d = new Date();
        String time = smf.format(d);
        String name = httpSessionBindingEvent.getName();
        //注 获取到的value为原数据，新的需要通过session再次获取
        Users oldValue = (Users) httpSessionBindingEvent.getValue();
        Users newValue = (Users) httpSessionBindingEvent.getSession().getAttribute(name);
//        //通过反射获取获取类名
//        String className = value.getClass().getSimpleName();

        System.out.println(time + "：在session作用域，替换了用户，原用户" + oldValue.getUsername() + "新用户：" + newValue.getUsername());
    }
}
