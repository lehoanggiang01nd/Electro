/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Category;
import model.Product;

/**
 *
 * @author MY LAPTOP
 */
@WebServlet(name = "managerServlet", urlPatterns = {"/manager"})
public class managerServlet extends HttpServlet {

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
//        ProductDAO dao = new ProductDAO();
//        List<Product> list = dao.getAllProduct();
        
//        request.setAttribute("listP", list);
        HttpSession session = request.getSession(true);
        Account a = (Account) session.getAttribute("acc");
        if(a.isIsAdmin()==true){
        ProductDAO dao = new ProductDAO();
        String indexP = request.getParameter("index");  
        if(indexP == null){
            indexP= "1";
        }
        int index = Integer.parseInt(indexP);        
        int count = dao.getToltalProduct();
        int endPage = count/6;
        if(count % 6 != 0){
            endPage++;
        }
        List<Product> list= dao.pagingProduct(index);
        CategoryDAO dao1 = new CategoryDAO();
        List<Category> list1 = dao1.getAllCategory();
        
        request.setAttribute("listP", list);
        request.setAttribute("endP",endPage);
        request.setAttribute("listB", list1);
        request.setAttribute("tag", index);
        request.getRequestDispatcher("ManagerProduct.jsp").forward(request, response);
        }else{
            response.sendRedirect("error.jsp");
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
