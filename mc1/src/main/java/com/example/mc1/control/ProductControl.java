package com.example.mc1.control;

import com.example.mc1.domain.Product;
import com.example.mc1.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductControl {

ProductService productService;
public ProductControl(ProductService productService){
    this.productService=productService;
}
@PostMapping("/product")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
    Product product1=productService.addProduct(product);
    return new ResponseEntity(product1, HttpStatus.CREATED);
}
@GetMapping("/movies")
    public ResponseEntity<?>getAllProduct(){
    List<Product> list=productService.getALlProduct();
    return new ResponseEntity<>(list,HttpStatus.OK);
}
}
