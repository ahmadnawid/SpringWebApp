package com.web.webApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data


public class Product {
    private int productId;
    private String productName;
    private int price;

    public Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId(){
        return productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
