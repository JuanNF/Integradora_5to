/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;
import PaqConexion.Conexion2;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ubald
 */
public class verNutriologo extends HttpServlet {
    ResultSet cdr = null;
    Statement sentenciaSQL = null;
    Conexion2 conecta = new Conexion2();

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        conecta.Conectar();
        sentenciaSQL = conecta.getSentenciaSQL();
    }
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
        String nutriologo = request.getParameter("nombre");
        String comando = "select id_dieta, registro.nombre nutriologo, plandietas.nombre, descripcion, costo, tiempo, resultados from plandietas inner join nutriologo on plandietas.id_nutriologo=nutriologo.id_Nutriologo inner join registro on nutriologo.id_registro=registro.id_registro";
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Ver Nutriologo</title>");            
//            out.println("</head>");
//             try {
//            cdr = sentenciaSQL.executeQuery(comando);
//            out.println("<body><center><h1>Planes Disponibles</h1></center><br></br>");
//            while (cdr.next()) {
//                out.println("<center>");
//                //request.setAttribute("Matricula: " + cdr.getString("matricula"));
//                out.println("Nombre del Plan: "+ cdr.getString("nutriologo")+"<br><br>");
//                out.println("Nutriologo del Plan: "+ cdr.getString("nombre")+"<br><br>");
//                out.println("Descripcion del Plan: "+ cdr.getString("descripcion")+"<br><br>");
//                out.println("Costo del Plan: "+ cdr.getString("costo")+"<br><br>");
//                out.println("Tiempo del Plan: "+ cdr.getString("tiempo")+"<br><br>");
//                out.println("Resultados del Plan: "+ cdr.getString("resultados")+"<br><br>");
//                out.println("<form><input type='submit' value='Comprar Plan'></form><br>");
//            }
//            out.println("</form>");
//            out.println("</body");
//        } catch (SQLException ex) {
//            out.println("Apuntando SQL: " + ex);
//        }
//            out.println("</html>");
            out.println(nutriologo);
        }
        
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
