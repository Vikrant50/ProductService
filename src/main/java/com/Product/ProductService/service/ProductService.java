package com.Product.ProductService.service;

import com.Product.ProductService.exceptions.ProductNotFoundExceptions;
import com.Product.ProductService.models.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(Long id) throws ProductNotFoundExceptions;
    List<Product> getAllProducts();

    Product replaceProduct(Long id, Product product);
}
