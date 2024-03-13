package org.suptech.tp0.metier;

import org.suptech.tp0.dao.ProductDao;
import org.suptech.tp0.entities.Product;

import java.util.List;

public class ProductMetier {
    private ProductDao dao = new ProductDao();
    public Product saveProduct(Product product) throws Exception{
        if(product.getQuantity() < 10)
            throw new Exception("Product can not be saved ...");
        return dao.addProduct(product);
    }
    public List<Product> getProducts(){
        return dao.getProducts();
    }
}
