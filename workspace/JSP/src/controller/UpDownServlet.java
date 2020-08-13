package controller;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;
//如果想要实现上传下载
//需要加上注解@MultipartConfig

@MultipartConfig
public class UpDownServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String pre = req.getParameter("pre");
        if (pre == null)
            show(req, resp);
        else if ("upload".equals(pre))
            upload(req, resp);
        else if ("delFile".equals(pre))
            delFile(req, resp);
        else if ("download".equals(pre))
            download(req, resp);


    }

    //获取上传的文件列表
    protected void show(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletContext().getRealPath("/upload");
        //获取项目的真实目录
        File file = new File(path);
        String[] ary = file.list();//子文件名集合 String[]
        //file.listFiles(); //子文件对象 File[]
        req.setAttribute("fileName", ary);
        req.getRequestDispatcher("/day6/showFile.jsp").forward(req, resp);
    }

    //上传处理
    protected void upload(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //一.获取文件对象
        Part imgFile = req.getPart("myFile");
        //类似于req.getParameter

        //1.获取文件名
        String fileName = imgFile.getSubmittedFileName();//该方法只能TOMCAT1.8以上才能使用
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString() + suffix;
        //二.保存到路径（之前创建的upload包）
        //1.获取服务器的真实路径
        String path = req.getServletContext().getRealPath("/upload");
        //自动在后面+/upload

        //2.获取IO流需要写入的路径
        String filePath = path + File.separator + newFileName;
        //File.separator为自动生成 斜杠/ 因为不同环境斜杠可能不同

        //三.通过IO流写入
        //Part类提供了一个写入方法write调用就完事了
        File f = new File(path);
        if (!f.exists()) {
            f.mkdirs();
        }
        imgFile.write(filePath);

        //跳转到一个页面展示
        resp.sendRedirect("/up");

    }

    protected void delFile(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileName = req.getParameter("fileName");
        String realPath = req.getServletContext().getRealPath("/upload");
        String filePath = realPath + File.separator + fileName;
        File file = new File(filePath);
        file.delete();
        resp.sendRedirect("/up");
    }

    protected void download(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取服务器中那个文件
        String fileName = req.getParameter("fileName");
        String filePath = req.getServletContext().getRealPath("/upload") + File.separator + fileName;
        //设置响应信息
        //1.获取文件类型 getMimeType(文件地址);
        String mimeType = req.getServletContext().getMimeType(filePath);
        //2.设置响应头部信息
        // resp.setHeader("content-disposition","attachment;filename=" + fileName);
        //                                       指定附件形式下载，并且指定下载后的名称
        resp.setHeader("content-disposition", "attachment;filename=" + fileName);
        //通过IO流传输
        ServletOutputStream sos = resp.getOutputStream();
        FileInputStream fis = new FileInputStream(filePath);
        byte[] bytes = new byte[1024];
        Integer length;
        while ((length = fis.read(bytes)) != -1) {
            sos.write(bytes, 0, length);
        }
        fis.close();
        sos.close();
    }


}
