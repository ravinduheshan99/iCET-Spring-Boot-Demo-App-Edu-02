package edu.icet.demo.service;

import edu.icet.demo.model.Product;

import java.util.List;

public interface ProductService {
    public Product persist(Product product);
    public List<Product> retrieve();
    public List<Product> getAllProductsByCategory(String category);
    public void removeProduct(Integer productId);
}
