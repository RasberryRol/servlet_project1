package com.servletproject1;

import com.servletproject1.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.text.DecimalFormat;

@WebServlet(name = "HomePageServlet", value = "/register")
public class HomePageServlet extends HttpServlet {
    TO BE DONE: -ADD CODE FOR 500 SERVER STATUS CODE WHEN THE FIELDS ARE EMPTY
                -FINISH LAST PART OF THE PROJECT'S RECOMENDATION
    private static final DecimalFormat df = new DecimalFormat("0.00");

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = new User(Integer.parseInt(req.getParameter("principalAmount"))
                                    ,Integer.parseInt(req.getParameter("interestRate"))
                                    ,Integer.parseInt(req.getParameter("time"))
                                    ,Integer.parseInt(req.getParameter("compoundNumber")));

        if(req.getParameter("principalAmount") == null || req.getParameter("interestRate") == null ||
            req.getParameter("time") == null || req.getParameter("compoundNumber") == null){
            req.setAttribute("error", "Your are missing one of the inputs!");
            doGet(req, resp);
            throw new NumberFormatException("Input fields cannot be blank!");
        }else{
            double principal = user.getPrincipalAmount();
            double interest = user.getInterestRate()/100;
            int time = user.getTime();
            int compound = user.getCompoundNumber();

            double interestOverCompound = interest/compound;
            int compoundByTime = compound * time;
            double exponentByParen = Math.pow((1+interestOverCompound), compoundByTime);

            double amount = principal * exponentByParen;
            req.setAttribute("principalAmount", "The result is: " + df.format(amount));
        }

        doGet(req, resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/input_Form.jsp").forward(req, resp);
    }

}