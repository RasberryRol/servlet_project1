<%--
  Created by IntelliJ IDEA.
  User: dief9
  Date: 6/16/2024
  Time: 9:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>${error}</h1>
    <form method="post" action="/register">

            <label for="principalAmount">Principal Amount:</label>
            <input type="number" id="principalAmount" name="principalAmount"><br><br>

            <label for="interestRate">Interest Rate (%):</label>
            <input type="number" id="interestRate" name="interestRate"><br><br>

            <label for="time">Time (years)</label>
            <input type="number" id="time" name="time"><br><br>

            <label for="compoundNumber">Number of Times/Year(to compound the interest)</label>
            <input type="number" id="compoundNumber" name="compoundNumber"><br><br>

            <button type="submit">Calculate</button>
    </form>

    <p>
        ${principalAmount}
    </p>
</body>
</html>
