package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Rectangulo;

import java.io.IOException;

@WebServlet("/Servlet")

public class ServletControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.procesamos parametros

        //2.creamos los javabeans
        Rectangulo rect = new Rectangulo(10,5);
        //3.Agregamos los javaBeans en algun alcanse
        req.setAttribute("mensaje", "Saludos desde el Servidor");
        //pasamos los parametros del rectangulo por seccion
        HttpSession sesion = req.getSession();
        //Compartir los datos y los modelos para consumir desde la vista
        sesion.setAttribute("rectangulo", rect);
        //4.redirecionamos a la vista indicada
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("vistas/despliegevariable.jsp");
        requestDispatcher.forward(req, resp);

    }
}
