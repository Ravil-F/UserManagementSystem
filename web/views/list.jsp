<%@ page import="java.util.List" %>
<%@ page import="app.entities.User" %>
<%@ page import="app.model.Model" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Users list</title>
        <link rel="stylesheet" href="../css/style_list.css">
    </head>
    <body>
        <header>
            <h1>Super app!</h1>
        </header>

        <main>
            <section>
                    <h2> Users </h2>
                    <div class="information">
                <%
                    List<User> users = (List<User>) request.getAttribute("users");
                    if(users != null && !users.isEmpty()){
                        out.println("<ui>");
                        for(User user : users){
                            out.println("<li>" + user.getName() + " | "
                                    + user.getLastName() + " | "
                                    + user.getGender() + " | "
                                    + user.getAge() + " | "
                                    + user.getEmail() + " | "
                                    + "</li>");
                        }
                        out.println("</ui>");
                    }else out.println("<p> There are no users yet!</p>");
                %>
            </div>
            </section>
        </main>

        <footer>
            <button onclick="location.href='/UserManagmentSystem_war_exploded/'"> Back to main</button>
        </footer>

    </body>
</html>
