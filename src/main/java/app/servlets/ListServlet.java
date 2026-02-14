package app.servlets;

import app.entities.User;
import app.model.Model;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.IOException;
import java.util.List;

public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model model = Model.getInstance();
        List<User> users = model.getAllUsers();
        req.setAttribute("users", users);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/list.jsp");
        dispatcher.forward(req, resp);
    }
}
