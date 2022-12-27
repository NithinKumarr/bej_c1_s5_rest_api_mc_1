package com.example.mc1.service;

import com.example.mc1.domain.Product;
import com.example.mc1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements ProductService{
@Autowired
    public MovieServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    ProductRepository productRepository;
    @Override
    public Product addProduct(Product p) {
        return productRepository.save(p);
    }

    @Override
    public List<Product> getALlProduct() {
        return (List<Product>) productRepository.findAll();
    }
}
