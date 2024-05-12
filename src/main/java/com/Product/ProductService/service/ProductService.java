package com.Product.ProductService.service;

import com.Product.ProductService.models.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(Long id);
    List<Product> getAllProducts();
}
