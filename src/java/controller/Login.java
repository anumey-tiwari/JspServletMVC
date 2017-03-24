package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dto.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.LoginService;

/**
 *
 * @author Anumey
 */
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String userId = (String)request.getParameter("userId");
        String password = (String)request.getParameter("password");
        LoginService loginService = new LoginService();

        boolean auth = loginService.authenticate(userId, password);
        if(auth){
            User user = loginService.getUserDetails(userId);
            request.setAttribute("user", user);
            
            RequestDispatcher requestDispacter =  request.getRequestDispatcher("success.jsp");
            requestDispacter.forward(request, response);
            return;
        }else{
            response.sendRedirect("login.jsp");
            return;
        }
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
