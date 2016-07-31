/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import newpackage.Mooseca;
import newpackage.MoosecaFactory;
import newpackage.Users;
import newpackage.UsersVend;

/**
 *
 * @author Pili
 */
public class ClientServlet extends HttpServlet {

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

        session.setAttribute("listaMusica", MoosecaFactory.getInstance().getMusica());
        //session.setAttribute("listaMusica", listaMusica);
        //ArrayList<Mooseca> listaMusica = (ArrayList<Mooseca>) session.getAttribute("listaMusica");

        if (session.getAttribute("loggedClient") != null && request.getParameter("submit") != null) {
            request.getRequestDispatcher("cliente.jsp").forward(request, response);

            //ricarica_conto 
        } else if (session.getAttribute("loggedClient") != null && request.getParameter("acconto") != null) {

            Users utente = (Users) session.getAttribute("cliente");
            Integer id = utente.getId();
            int soldi = Integer.parseInt(request.getParameter("ricarica"));
            //utente = MoosecaFactory.getInstance().getClientPerId(id);        
            if (soldi > 0) {

                MoosecaFactory.getInstance().carica(id, soldi);
                request.setAttribute("accredito", " effettuata");
                request.getRequestDispatcher("cliente.jsp").forward(request, response);
            } else {
                request.setAttribute("accredito", " non effettuata");
                request.getRequestDispatcher("cliente.jsp").forward(request, response);
            }

        } else if (session.getAttribute("loggedClient") != null && request.getParameter("codAcquisto") != null) {
            int idAlbum = Integer.parseInt(request.getParameter("codAcquisto"));
            try {
                if (MoosecaFactory.getInstance().getMusicaId(idAlbum) != null) {

                    Mooseca album_acquisto = MoosecaFactory.getInstance().getMusicaId(Integer.parseInt(request.getParameter("codAcquisto")));

                    request.setAttribute("album", MoosecaFactory.getInstance().getMusicaId(Integer.parseInt(request.getParameter("codAcquisto"))));
                    //sostituisco tutti gli spazi con "+" nell'URL
                    String name = album_acquisto.getNomeOgg();
                    String autor = album_acquisto.getAutore();
                    name = name.replaceAll(" ", "+");
                    autor = autor.replaceAll(" ", "+");
                    // imposto una variabile carrello che contiene i dati per la visualizzazione
                    request.setAttribute("carrello", "<div>\n" + "<a href=\"cliente.html?nomeAlbum=" + name + "&tipoAlbum=" + album_acquisto.getTipo() + "&prezzoAlbum=" + album_acquisto.getPrezzo() + "&autoreAlbum=" + autor + "&album=" + album_acquisto.getCodice() + "\">" + "<input type=\"submit\" id=\"acquista\" name=\"acquista\" value=\"Acquista\"/></div>");

                    request.getRequestDispatcher("riepilogo.jsp").forward(request, response);
                }
            } catch (Exception e) {
            }
        } else if (session.getAttribute("loggedClient") != null  && request.getParameter("nomeAlbum") != null && request.getParameter("tipoAlbum") != null && request.getParameter("prezzoAlbum") != null && request.getParameter("autoreAlbum") != null && request.getParameter("album") != null) {

            Users utente = (Users) session.getAttribute("cliente");
            //Integer conto = utente.getConto().getConto();
            //Integer prezzo = Integer.parseInt(request.getParameter("prezzoAlbum"));
            Boolean ok = false;
            //Mooseca album = (Mooseca) request.getAttribute("album");
            Mooseca album = MoosecaFactory.getInstance().getMusicaId(Integer.parseInt(request.getParameter("album")));
            try {
                ok = MoosecaFactory.getInstance().acquisto(utente.getId(), album.getCodice());
            } catch (SQLException e) {
            }

            if (!ok) {
                request.setAttribute("messaggio", "Attenzione, il suo saldo non è sufficiente per complettare l'acquisto dell'album: " + request.getParameter("nomeAlbum") + " di " + request.getParameter("autoreAlbum"));
            } else {
                request.setAttribute("messaggio", "Il suo acquisto è andato a buon fine: " + request.getParameter("nomeAlbum") + " di " + request.getParameter("autoreAlbum") + ". Il suo saldo residuo è di " + utente.getConto().getConto() + " £.");
            }
            request.getRequestDispatcher("acquisto_confermato.jsp").forward(request, response);
        } else if (session.getAttribute("loggedClient") != null) {
            request.getRequestDispatcher("cliente.jsp").forward(request, response);
        } else if (session.getAttribute("loggedVend") != null) {
            request.setAttribute("errore", "Sei già connesso come <a href=venditore.html>Venditore</a>:");
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
