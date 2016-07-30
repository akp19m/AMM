/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import newpackage.Mooseca;
import newpackage.MoosecaFactory;
import newpackage.UsersVend;

/**
 *
 * @author Pili
 */
public class VendServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession();

        if (session.getAttribute("loggedVend") != null && request.getParameter("submit") != null) {

            request.getRequestDispatcher("venditore.jsp").forward(request, response);

        } else if (session.getAttribute("loggedVend") != null && request.getParameter("aggiungi") != null) {
            Mooseca newAlbum = new Mooseca();
            //in tutti questi if controllo se i valori non siano nulli 
            if (request.getParameter("name").equals("")) {
                request.getRequestDispatcher("venditore.jsp").forward(request, response);
            } else {
                newAlbum.setNomeOgg(request.getParameter("name"));
            }
            //il tipo deve essere uguale ad uno di questi tre, altrimenti novabbene
            //la variabile di pag."tipo" se non viene premuto nessun radio button, non è presente,
            //per "ovviare" a questo problema ho messo il try&catch 
            try {
                if (request.getParameter("tipo").equals("CD") || request.getParameter("tipo").equals("Vinile") || request.getParameter("tipo").equals("MP3")) {
                    newAlbum.setTipo(request.getParameter("tipo"));
                } else {
                    request.getRequestDispatcher("venditore.jsp").forward(request, response);
                }
            } catch (Exception e) {
                request.getRequestDispatcher("venditore.jsp").forward(request, response);
            }

            if (request.getParameter("autore").equals("")) {
                request.getRequestDispatcher("venditore.jsp").forward(request, response);
            } else {
                newAlbum.setAutore(request.getParameter("autore"));
            }

            if (request.getParameter("cover").equals("")) {
                request.getRequestDispatcher("venditore.jsp").forward(request, response);
            } else {

                newAlbum.setCoverLink(request.getParameter("cover"));
            }

            if (Integer.parseInt(request.getParameter("prezzo")) > 0) {
                newAlbum.setPrezzo(Integer.parseInt(request.getParameter("prezzo")));
            } else {
                request.getRequestDispatcher("venditore.jsp").forward(request, response);
            }

            newAlbum.setVend((UsersVend) session.getAttribute("venditore"));

            request.setAttribute("album", newAlbum);

            //ArrayList<Mooseca> listaMusica = MoosecaFactory.getInstance().getMusica();
            //listaMusica.add(newAlbum);
            //MI SONO ACCORTO DOPO CHE AVREI POTUTO PASSARE DIRETTAMENTE L'OGGETTO ANZICHE' I SINGOLI CAMPI
            //MoosecaFactory.getInstance().aggiungiAlbum(newAlbum.getVend().getId(),newAlbum.getNomeOgg(),newAlbum.getTipo(),newAlbum.getAutore(),newAlbum.getCoverLink(),newAlbum.getPrezzo());         
            MoosecaFactory.getInstance().aggiungiAlbum(newAlbum);
            //aggiorno la lista della sessione
            session.setAttribute("listaMusica", MoosecaFactory.getInstance().getMusica());

            request.getRequestDispatcher("album_inserito.jsp").forward(request, response);

        } else if (session.getAttribute("loggedVend") != null) {
            request.getRequestDispatcher("venditore.jsp").forward(request, response);
        } else if (session.getAttribute("loggedClient") != null) {
            request.setAttribute("errore", "Sei già connesso come <a href=cliente.html>Cliente</a>:");
        }

        request.getRequestDispatcher("accessonegato.jsp").forward(request, response);
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
