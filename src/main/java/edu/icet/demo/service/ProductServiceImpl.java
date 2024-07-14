package edu.icet.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.entity.ProductEntity;
import edu.icet.demo.model.Product;
import edu.icet.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;

    @Autowired
    ObjectMapper mapper;

    /*
    @Autowired
    ModelMapper mapper;
    */

    public Product persist(Product product) {
        ProductEntity entity = mapper.convertValue(product, ProductEntity.class);
        repository.save(entity);
        return mapper.convertValue(entity,Product.class);

    }

    public List<Product> retrieve() {
        Iterable<ProductEntity> allProducts = repository.findAll();
        List<Product> products = new ArrayList<>();
        allProducts.forEach(entity -> {
            Product prodObj = mapper.convertValue(entity, Product.class);
            products.add(prodObj);
        });

        return products;
    }

    public List<Product> getAllProductsByCategory(String category) {
        Iterable<ProductEntity> allProducts = repository.findAllByCategory(category);
        List<Product> products = new ArrayList<>();
        allProducts.forEach(productEntity -> {
            Product product = mapper.convertValue(productEntity, Product.class);
            products.add(product);
        });

        return products;
    }

    public void removeProduct(Integer productId){
        Optional<ProductEntity> byId = repository.findById(productId);
        repository.delete(byId.get());
    }
}
