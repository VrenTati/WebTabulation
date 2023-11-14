package com.example.webtabulation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "tab-servlet", value = "/tab-servlet")
public class TabulationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double start = Double.parseDouble(request.getParameter("start"));
        double end = Double.parseDouble(request.getParameter("end"));
        double step = Double.parseDouble(request.getParameter("step"));

        Tabulation tabulation = new Tabulation(start, end, step);

        request.setAttribute("tabulation", tabulation);
        request.getRequestDispatcher("/tabulation.jsp").forward(request, response);
    }
}
