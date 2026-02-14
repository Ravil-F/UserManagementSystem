package app.servlets;

import app.entities.User;
import app.model.Model;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/add.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String gender = req.getParameter("gender");
        String ageStr = req.getParameter("age");
        String email = req.getParameter("email");

        if(name == null || name.isEmpty()
                || lastName == null || lastName.isEmpty()
                ||gender ==null || gender.isEmpty()
                || ageStr == null || ageStr.isEmpty()){
            req.setAttribute("error", "All fields must be filled in!");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/views/add.jsp");
            dispatcher.forward(req, resp);
            return;
        }else {
            name = name.trim();
            lastName = lastName.trim();
            gender = gender.trim();
            int age = Integer.parseInt(ageStr.trim());
            email = email.trim();
            User user = new User(name, lastName, gender, age, email);
            Model model = Model.getInstance();
            model.add(user);

            req.setAttribute("userName", name);
            doGet(req, resp);
        }
    }
}
