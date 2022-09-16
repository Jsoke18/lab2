/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mucky
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/Arithmetic"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = "---";
        request.setAttribute("message", message);
        this.getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstStr = request.getParameter("first");
        String secondStr = request.getParameter("second");
        String calc = request.getParameter("calc");

        String message = "";
        try {
            double first = Integer.parseInt(firstStr);
            double second = Integer.parseInt(secondStr);
            double total = 0;

            //calculations 
            switch (calc) {
                case "add":
                    total = first + second;
                    break;
                case "sub":
                    total = second - first;
                    break;
                case "mult":
                    total = first * second;
                    break;
                case "mod":
                    total = first % second;
                    break;
            }
            message = Double.toString(total);
        } catch (Exception e) {
            message = "Invalid";
        }

        request.setAttribute("message", message);

        this.getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
    }
}
