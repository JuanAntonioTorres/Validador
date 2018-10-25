package controller;

import validate.ValidadorImagen;
import validate.ValidarSexo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/vali")
public class ValidarImage extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String rutaImagen = request.getParameter("image");
       ValidadorImagen validadorImage= new ValidadorImagen(rutaImagen);
       System.out.println(validadorImage.validar());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
