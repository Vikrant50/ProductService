package com.Product.ProductService.service;

import com.Product.ProductService.dtos.FakeStoreProductDto;
import com.Product.ProductService.models.Category;
import com.Product.ProductService.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Locale;

@Service
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;

    FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    private Product convertFaheStoreDtoToProduct(FakeStoreProductDto dto){

        Product product = new Product();
        product.setId(dto.getId());
        product.setTitle(dto.getTitle());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDesc());
        product.setImage(dto.getImage());

        Category category = new Category();
        category.setDescription(dto.getDesc());
        product.setCategory(category);

        return product;
    }

    @Override
    public Product getProductById(Long id) {
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/"+id,
                FakeStoreProductDto.class);

        if (fakeStoreProductDto==null){
            return null;
        }

        return  convertFaheStoreDtoToProduct(fakeStoreProductDto);
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }
}
