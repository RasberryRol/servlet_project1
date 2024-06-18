package com.servletproject1;

import com.servletproject1.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.text.DecimalFormat;

@WebServlet(name = "HomePageServlet", value = "/register")
public class HomePageServlet extends HttpServlet {



    private static final DecimalFormat df = new DecimalFormat("0.00");

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String pAmount = req.getParameter("principalAmount");
            String intRate = req.getParameter("interestRate");
            String timeYear = req.getParameter("time");
            String compNumber = req.getParameter("compoundNumber");


            if(pAmount.isBlank() || intRate.isBlank() || timeYear.isBlank() || compNumber.isBlank()){
                StringBuilder error = new StringBuilder();
                error.append("One or more field is empty. Try again!");
                req.setAttribute("error", error);
                req.setAttribute("user", new User(pAmount, intRate, timeYear, compNumber));
                doGet(req, resp);
            } else{
                double principal = Integer.parseInt(pAmount);
                double interestRate = Integer.parseInt(intRate);
                double time = Integer.parseInt(timeYear);
                double compoundNumber = Integer.parseInt(compNumber);


                double interestCalc = interestRate/100;

                double interestOverCompound = interestCalc/compoundNumber;
                double compoundByTime = compoundNumber * time;
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