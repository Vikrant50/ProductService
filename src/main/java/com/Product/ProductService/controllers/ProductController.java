package com.Product.ProductService.controllers;


import com.Product.ProductService.exceptions.ProductNotFoundExceptions;
import com.Product.ProductService.models.Product;
import com.Product.ProductService.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // for response and setting our own status i use response entity of type
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) throws ProductNotFoundExceptions {
        Product product = productService.getProductById(id);
        ResponseEntity<Product> responseEntity;

//        if (product == null) {
//
//            responseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);
//            return responseEntity;
//        }
        responseEntity = new ResponseEntity<>(product,HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }


    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id,@RequestBody Product product){
        return productService.replaceProduct(id,product);

    }
}
