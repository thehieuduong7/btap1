package vn.iotstar.controller.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/truSoLuong" })
public class SubstractQuantityController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        int soLuong = Interger.parse(req.getParameter("soLuong"));

        if (soLuong > 1)
            soLuong = soLuong - 1;

        PrintWriter out = resp.getWriter();
        out.print("SoLuong: " + String.valueOf(soLuong));
    }

}