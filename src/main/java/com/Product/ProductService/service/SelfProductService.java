package com.Product.ProductService.service;

import com.Product.ProductService.exceptions.ProductNotFoundExceptions;
import com.Product.ProductService.models.Product;
import com.Product.ProductService.repositiories.ProductRepositories;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
public class SelfProductService implements ProductService{

    private ProductRepositories productRepositories;

    public SelfProductService(ProductRepositories productRepositories) {
        this.productRepositories = productRepositories;
    }

    @Override
    public Product getProductById(Long id) throws ProductNotFoundExceptions {
        //fetch the product from database..
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct() {

    }
}
