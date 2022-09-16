package ca.sait.servlets;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
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
@WebServlet(urlPatterns = {"/AgeCalculatorServlet"})
public class AgeCalculatorServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageStr = request.getParameter("age");
        int age = 0;
        String message = "";

        try {
            age = Integer.parseInt(ageStr);
            age++;
            request.setAttribute("age", age);
        } catch (Exception e) {
            if (ageStr == null || ageStr == " ") {

                message = "You must enter a value";
            } else {
                message = "You must only use numbers";
            }

        }
        request.setAttribute("message", message); 
        

        this.getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
    }
}
