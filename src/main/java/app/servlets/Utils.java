package app.servlets;

import app.model.Model;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

public class Utils {

    public static void setUserAttiributes(HttpServletRequest req) {
        Model model = Model.getInstance();
        List<String> names = model.listName();
        List<String> lastNames = model.listLastName();
        List<String> genders = model.listGender();
        List<Integer> ages = model.listAge();
        List<String> emails = model.listEmail();

        req.setAttribute("userNames", names);
        req.setAttribute("lastNames", lastNames);
        req.setAttribute("gender", genders);
        req.setAttribute("age", ages);
        req.setAttribute("email", emails);
    }

}
