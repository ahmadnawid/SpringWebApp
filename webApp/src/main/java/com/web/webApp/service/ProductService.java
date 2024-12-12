package com.web.webApp.service;

import com.web.webApp.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000),
            new Product(102, "Samsung", 4000),
            new Product(103, "Nokia", 1000)));

    public List<Product> getProducts(){
        return products;
    }


    public Product getProductById(int productId) {
        return products.stream()
                .filter(p -> p.getProductId() == productId)
                .findFirst().orElse(new Product(100, "No Item", 0));
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for(int a=0;a<products.size();a++){
            if(products.get(a).getProductId() == product.getProductId())
                index = a;
            products.set(index, product);
        }

    }

    public void deleteProduct(int productId) {
        int index = 0;
        for(int a=0;a<products.size();a++){
            if(products.get(a).getProductId() == productId)
                index = a;
            products.remove(index);
        }
    }
}
