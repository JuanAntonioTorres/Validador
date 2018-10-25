package controller;

import validate.ValidacionCadenaConEspacio;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/vali")
public class ValidarClientLastName extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String clientLastName = request.getParameter("clientLastName");
       ValidacionCadenaConEspacio validacionCadenaConEspacio = new ValidacionCadenaConEspacio(clientLastName);
       System.out.println(validacionCadenaConEspacio.validar());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
