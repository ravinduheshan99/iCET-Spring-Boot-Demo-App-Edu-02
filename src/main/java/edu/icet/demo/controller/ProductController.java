package edu.icet.demo.controller;

import edu.icet.demo.model.Product;
import edu.icet.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/product")
    public Product persist(@RequestBody Product product){
        //persist is the industrial term for word save
       return service.persist(product);
    }

    @GetMapping("/products")
    public List<Product> retrieve(){
        return service.retrieve();
    }

    @GetMapping("/products-by-category/{category}")
    public List<Product> getAllProductsByCategory(@PathVariable String category){
        return service.getAllProductsByCategory(category);
    }

    @DeleteMapping("/product")
    public void remove(@RequestParam(name = "id") Integer productId){
        service.removeProduct(productId);
    }

    /*
    http://localhost:8080/product/PV/08/103 <-Assume we want to pass a company number like this, we can't pass using this method because it identified it as a url

    @DeleteMapping("/product/{productId}")
    Product remove(@PathVariable String productId){
        return service.delete();
    }

    http://localhost:8080/product?id=PV/08/103 <- Solution

    @DeleteMapping("/product")
    Product remove(@RequestParam String productId){
        return service.delete();
    }

    */
}
