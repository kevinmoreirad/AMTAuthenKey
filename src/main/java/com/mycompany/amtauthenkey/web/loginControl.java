
package com.mycompany.amtauthenkey.web;

import com.mycompany.amtauthenkey.servicies.AuthKeyManager;
import com.mycompany.amtauthenkey.servicies.LoginManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kevin moreira
 */
public class loginControl extends HttpServlet {

        @EJB
        private LoginManager loginManager;  
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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
        
           request.getRequestDispatcher("pages/login.jsp").forward(request, response);              
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
      
        String username = request.getParameter("inputUsername");
        String password = request.getParameter("inputPassword");
        
        //if the login info are null or not in the database, we send to the login page
        if((username == null && password == null) || 
                !loginManager.isOnDataBase(username, password))
        {
           request.getRequestDispatcher("pages/login.jsp").forward(request, response); 
        }
        else
            request.getRequestDispatcher("pages/pageView.jsp").forward(request, response); 
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
