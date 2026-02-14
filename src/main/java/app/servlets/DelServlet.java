package app.servlets;

import app.entities.User;
import app.model.Model;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.http.HttpHeaders;
import java.util.List;

public class DelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model model = Model.getInstance();
        List<User> users = model.getAllUsers();
        req.setAttribute("users", users);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/del.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Model model = Model.getInstance();

        String delName = req.getParameter("name");
        model.del(delName);
        doGet(req, resp);
    }

}
