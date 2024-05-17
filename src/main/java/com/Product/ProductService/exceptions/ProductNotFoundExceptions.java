package com.Product.ProductService.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundExceptions extends Exception{


    private Long id;
    private String message;

    public ProductNotFoundExceptions(Long id,String message){
        super(message);
        this.id =id;
    }
}
