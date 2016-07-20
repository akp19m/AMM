/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import newpackage.MoosecaFactory;
import newpackage.Users;
import newpackage.UsersVend;

/**
 *
 * @author Pili
 */
@WebServlet(name = "Login", urlPatterns = {"/login.html"}, loadOnStartup = 0)
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String DB_CLEAN_PATH = "../../web/WEB-INF/db/progetto_db";
    private static final String DB_BUILD_PATH = "WEB-INF/db/progetto_db";

    @Override
    public void init() {
        String dbConnection = "jdbc:derby:" + this.getServletContext().getRealPath("/") + DB_BUILD_PATH;
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        MoosecaFactory.getInstance().setConnectionString(dbConnection);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        //inizializzare la sessione
        HttpSession session = request.getSession();

        if (request.getParameter("submit") != null) {
            String username = request.getParameter("user");
            String password = request.getParameter("pass");

            Users u = MoosecaFactory.getInstance().getUtente(username, password);
            //variabile errore usata solo nel caso in cui si ritorni nella pag login.jsp
            request.setAttribute("errore", "Compilare correttamente i campi Username e Password:");

            if (u != null) {

                //ArrayList<Users> listaUtenti = MoosecaFactory.getInstance().getUserList();
                //ArrayList<Mooseca> listaMusica = MoosecaFactory.getInstance().getMusica();

            //for (Users u : listaUtenti) {
                //if (u.getUsername().equals(username)) {
                //if (u.getPassword().equals(password)) {
                //settaggio attributi della sessione
                session.setAttribute("idUtente", u.getId());

                if (u instanceof UsersVend) {
                    session.setAttribute("venditore", u);
                    session.setAttribute("loggedVend", true);
                    session.setAttribute("loggedClient", null);
                    request.getRequestDispatcher("venditore.jsp").forward(request, response);

                } else {
                    session.setAttribute("cliente", u);
                    session.setAttribute("listaMusica", MoosecaFactory.getInstance().getMusica());
                    //session.setAttribute("listaMusica", listaMusica);
                    session.setAttribute("loggedVend", null);
                    session.setAttribute("loggedClient", true);
                    request.getRequestDispatcher("cliente.jsp").forward(request, response);
                }
            }
        }

        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
