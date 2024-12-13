package com.web.webApp.service;

import com.web.webApp.model.Product;
import com.web.webApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

  /*  List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Samsung", 4000),
            new Product(103, "Nokia", 1000)));*/

    public List<Product> getProducts(){
        return repository.findAll();
    }


    public Product getProductById(int productId) {
        return repository.findById(productId).orElse(new Product());
    }

    public void addProduct(Product product){
        repository.save(product);
    }

    public void updateProduct(Product product) {
        repository.save(product);
    }

    public void deleteProduct(int productId) {
        repository.deleteById(productId);
    }
}
