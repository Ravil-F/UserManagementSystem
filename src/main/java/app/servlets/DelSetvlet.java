package app.servlets;

import app.model.Model;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class DelSetvlet extends HttpServlet {
    protected void goGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model model = Model.getInstance();
        List<String> names = model.list();
        req.setAttribute("userNames", names);

        String delName = req.getParameter("name");
        model.del(delName);

        RequestDispatcher dispatcher = req.getRequestDispatcher("views/del.jsp");
        dispatcher.forward(req, resp);

    }

}
