package com.sc.control;

import com.sc.pojo.Account;
import com.sc.service.AccountService;
import com.sc.service.impl.AccountServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.UUID;

@MultipartConfig
public class AccountServlet extends HttpServlet {
    private String base;
    private AccountService as = new AccountServiceImpl();

    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext application = config.getServletContext();
        base = application.getContextPath();
        application.setAttribute("base", base);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pre = req.getParameter("pre");
        if ("login".equals(pre))
            login(req, resp);
        if ("register".equals(pre))
            register(req, resp);
        if ("tran".equals(pre))
            tran(req, resp);
        if ("modifyPwd".equals(pre))
            modifyPwd(req, resp);

    }

    private void modifyPwd(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //获取信息
        Account thisAccount = (Account) req.getSession().getAttribute("account");
        String thisPwd = thisAccount.getPassword();
        String oldPwd = req.getParameter("oldPwd");
        String newPwd = req.getParameter("newPwd");
        PrintWriter out = resp.getWriter();
        //判断密码是否输入正确
        if (!thisPwd.equals(oldPwd)) {
            out.print("<script>" +
                    "alert('旧密码输入错误');" +
                    "location.href='" + base + "/bank/editpwd.jsp';" +
                    "</script>");
        } else {
            boolean b = as.modifyPwd(thisAccount, newPwd);
            if (b)
                req.setAttribute("status", "成功");
            req.getRequestDispatcher("/bank/editpwd.jsp").forward(req, resp);
        }
    }


    private void tran(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //获取请求信息和当前用户信息
        Account thisAccount = (Account) req.getSession().getAttribute("account");
        String thisCardNo = thisAccount.getCardNo();
        String tranCardNo = req.getParameter("cardNo");
        String money = req.getParameter("money");
        Double mon = Double.parseDouble(money);
        String result = as.transaction(thisCardNo, tranCardNo, money, null);
        if ("true".equals(result)) {
            //修改当前session中的Account对象
            thisAccount.setBalance(thisAccount.getBalance() - mon);
            req.setAttribute("tranStatus", result);
            req.getRequestDispatcher("/bank/transaction.jsp").forward(req, resp);
        } else {
            PrintWriter out = resp.getWriter();
            out.print("<script>" +
                    "alert('" + result + "');" +
                    "location.href='" + base + "/bank/transaction.jsp';" +
                    "</script>");
        }
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //获取请求信息
        String cardNo = req.getParameter("cardNo");
        String password = req.getParameter("password");
        //获取对应的JSP对象
        HttpSession session = req.getSession();
        PrintWriter out = resp.getWriter();
        //对状态进行判定
        Map<Account, String> acMap = as.login(cardNo, password);
        Account a = null;
        String status = null;

        for (Account account : acMap.keySet()) {
            a = account;
            status = acMap.get(account);
        }
        switch (status) {
            case "true":
                session.setAttribute("account", a);
                resp.sendRedirect(base + "/bank/main.jsp");
                break;
            case "username":
                out.print("<script>" +
                        "alert('登录失败！您输入的卡号不存在，请重新输入！');" +
                        "location.href='" + base + "/index.jsp'"
                        + "</script>");
                break;
            case "password":
                out.print("<script>" +
                        "alert('登录失败！您输入的密码错误，请重新输入！');" +
                        "location.href='" + base + "/index.jsp'"
                        + "</script>");
                break;
            case "status":
                out.print("<script>" +
                        "alert('登录失败！您的账号已被冻结！');" +
                        "location.href='" + base + "/index.jsp'"
                        + "</script>");
                break;
        }

    }

    private void register(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //获取请求信息
        Part avatar = req.getPart("avatar");
        String cardNo = req.getParameter("cardNo");
        String password = req.getParameter("password");

        //获取文件新的文件名和目录
        String avatarFileName = avatar.getSubmittedFileName();
        String suffix = avatarFileName.substring(avatarFileName.lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString() + suffix;

        String realPath = req.getServletContext().getRealPath("/upload") + File.separator + newFileName;

        //写入文件
        File f = new File(req.getServletContext().getRealPath("/upload"));
        if (!f.exists())
            f.mkdirs();
        avatar.write(realPath);

        //向数据库中存入信息
        as.insert(cardNo, password, newFileName);

        //跳转到主页面
        resp.sendRedirect(base + "/index.jsp");
    }
}
