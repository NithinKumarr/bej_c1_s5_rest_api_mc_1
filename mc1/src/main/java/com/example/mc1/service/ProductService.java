package com.example.mc1.service;

import com.example.mc1.domain.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product p);
    public List<Product> getALlProduct();
}
