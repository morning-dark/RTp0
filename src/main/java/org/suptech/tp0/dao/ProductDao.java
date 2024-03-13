package org.suptech.tp0.dao;

import org.suptech.tp0.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> products = new ArrayList<>();

    public ProductDao(){
        products = List.of(
                new Product("R01","Product1",3000,20),
                new Product("R02","Product2",34000,90),
                new Product("R03","Product3",1000,40),
                new Product("R04","Product4",200,100)
        );
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product addProduct(Product product){
        products.add(product);
        return product;
    }
}
