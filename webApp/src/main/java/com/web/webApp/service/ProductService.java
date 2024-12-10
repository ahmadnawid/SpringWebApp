package com.web.webApp.service;

import com.web.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "Iphone", 50000),
            new Product(102, "Samsung", 4000));

    public List<Product> getProducts(){
        return products;
    }
}
