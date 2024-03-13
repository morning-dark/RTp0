package org.suptech.tp0.web.controller;

import org.suptech.tp0.entities.Product;
import org.suptech.tp0.metier.ProductMetier;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ProductController extends HttpServlet {

    private ProductMetier metier = new ProductMetier();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = metier.getProducts();
        req.setAttribute("products",products);
         req.getRequestDispatcher("WEB-INF/views/products.jsp").forward(req,resp);
    }
}
