<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 04.02.2026
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Add new user </title>
    <link rel="stylesheet" href="../css/style_add.css">
</head>
<body>
    <header>
        <h1>Super app!</h1> 
    </header>

    <main>
        <section class="added_information">
            <%
                if(request.getAttribute("userName") != null)
                    out.println("<p>User '" + request.getAttribute("userName") + "' added!</p>");
            %>
        </section>

        <section class="add">
            <h2>
                Add user
            </h2>
            <form method="post">
                <label>Name:
                    <input type="text" name="name">
                </label>

                <label>Last name:
                    <input type="text" name="lastName">
                </label>

                <label>Gender:
                    <select name="gender">
                        <option value="M">Male</option>
                        <option value="F">Female</option>
                    </select>
                </label>

                 <label>Age:
                    <select name = "age" class="age">
                        
                    </select>
                </label>

                <label class="email">Email:
                    <input type="text" name="email">
                </label>
                <button type="submit">Submit</button>
            </form>
        </section>
    </main>

    <footer>
        <button onclick="location.href='../../UserManagementSystem'"> Back to main</button>
    </footer>

    <script src="../js/script.js"></script>
</body>
</html>
