<%--
  Created by IntelliJ IDEA.
  User: dief9
  Date: 6/16/2024
  Time: 9:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<div class="form-container">
    <h2>${error}</h2>
    <form action="/register" method="POST">
                    <div class="form-group">
                        <label for="principalAmount">Principal Amount:</label>
                        <input type="number" id="principalAmount" name="principalAmount" value=${user.principalAmount}><br><br>
                    </div>

                    <div class="form-group">
                        <label for="interestRate">Interest Rate (%):</label>
                        <input min="1" max="100" type="number" id="interestRate" name="interestRate" value=${user.interestRate}><br><br>
                    </div>

                    <div class="form-group">
                        <label for="time">Time (years)</label>
                        <input min="1" type="number" id="time" name="time" value=${user.time}><br><br>
                    </div>

                    <div class="form-group">
                        <label for="compoundNumber">Number of Times/Year(to compound the interest)</label>
                        <input min="1" max="12" type="number" id="compoundNumber" name="compoundNumber" value=${user.compoundNumber}><br><br>
                    </div>
                    <button type="submit">Calculate</button>
                </form>

                <p>
                    ${principalAmount}
                </p>

            </div>
            </body>
            </html>