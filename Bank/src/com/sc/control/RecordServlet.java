package com.sc.control;

import com.sc.pojo.Account;
import com.sc.pojo.Record;
import com.sc.service.RecordService;
import com.sc.service.impl.RecordServiceImpl;
import com.sc.util.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        displayName = "record",
        urlPatterns = "/record",
        loadOnStartup = 1
)
public class RecordServlet extends HttpServlet {
    RecordService rs = new RecordServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pre = req.getParameter("pre");
        if (pre == null)
            show(req, resp);
    }

    private void show(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据
        Account thisAccount = (Account) req.getSession().getAttribute("account");
        String thisCardNo = thisAccount.getCardNo();
        String getPageIndex = req.getParameter("pageIndex");
        String getPageSize = req.getParameter("pageSize");
        int totalCount = rs.getCount(thisCardNo);
        Integer pageIndex = 1;
        Integer pageSize = 5;
        if (getPageIndex != null)
            pageIndex = Integer.parseInt(getPageIndex);
        if (getPageSize != null)
            pageSize = Integer.parseInt(getPageSize);

        List<Record> list = rs.getPage(thisCardNo, pageIndex, pageSize);
        Page<Record> page = new Page<>(pageIndex, pageSize, totalCount, list);

        req.setAttribute("page", page);
        req.getRequestDispatcher("/bank/selrecord.jsp").forward(req, resp);
    }


}
