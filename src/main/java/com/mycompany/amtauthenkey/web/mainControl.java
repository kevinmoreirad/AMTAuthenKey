/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.amtauthenkey.web;

import com.mycompany.amtauthenkey.model.AuthKey;
import com.mycompany.amtauthenkey.servicies.AuthKeyManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;

/**
 *
 * @author kevin moreira
 */
public class mainControl extends HttpServlet {

    
    @EJB
    private AuthKeyManager authKeyManager; 
    
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
        
        //getting the username of the connected client.
        Object userName = request.getSession().getAttribute("username");
        
        
        AuthKey authKey = authKeyManager.getRandomAuthKey();
        
        request.setAttribute("theAuthKey", authKey);
        //giving the jsp the control of request and response
        request.getRequestDispatcher("pages/pageView.jsp").forward(request, response);
    };
    

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
                try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet mainControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet mainControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
