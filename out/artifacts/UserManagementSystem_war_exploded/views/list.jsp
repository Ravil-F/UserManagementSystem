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
                <h2>Users</h2>
                <%
                    List<User> users = (List<User>) request.getAttribute("users");
                    if(users != null && !users.isEmpty()){
                        
                        for(User user : users){
                            out.println("<div class=\"block\">");
                            out.println("<div>" + user.getName() + "</div>"
                                    + "<div>" + user.getLastName() + "</div>"
                                    + "<div class=\"gender\">" + user.getGender() + "</div>"
                                    + "<div class=\"age\">" + user.getAge() + "</div>"
                                    + "<div>" + user.getEmail() + "</div>"
                                    );
                            out.println("</div>");
                        }
                        
                    }else out.println("<p> There are no users yet!</p>");
                %>
            </section>
        </main>

        <footer>
            <button onclick="location.href='../../UserManagementSystem'"> Back to main</button>
        </footer>

    </body>
</html>
