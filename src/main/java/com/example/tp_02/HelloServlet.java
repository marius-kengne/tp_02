package com.example.tp_02;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello world, this is my first servlet</h1>");
        out.println("<p>Current time: " + formattedTime + "</p>");
        out.println("</body></html>");
    }


    // Methode doGet qui utilise le fichier HTML
    /*
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/hello.html");
        dispatcher.forward(request, response);

    }
    */
    public void destroy() {
    }
}