package com.sc.controller;

import com.sc.pojo.Video;
import com.sc.service.VideoService;
import com.sc.service.impl.VideoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/video")
public class DoVideoServlet extends HttpServlet {
    VideoService vs = new VideoServiceImpl();
    String base;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        base = req.getServletContext().getContextPath();
        String pre = req.getParameter("pre");
        if (pre == null)
            getVideo(req, resp);
    }

    private void getVideo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String videoName = req.getParameter("videoName");
        Video video = vs.getVideo(videoName);
        req.setAttribute("video", video);
        req.getRequestDispatcher("/newspages/video.jsp").forward(req, resp);
    }
}
