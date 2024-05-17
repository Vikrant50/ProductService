package com.Product.ProductService.exceptionhandler;

import com.Product.ProductService.dtos.ExceptionDto;
import com.Product.ProductService.dtos.ProductNotFoundExceptionDto;
import com.Product.ProductService.exceptions.ProductNotFoundExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ExceptionDto> handleArithmeticException(){

        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage("something went wrong");
        exceptionDto.setResolution("nothing can be donr");

        ResponseEntity<ExceptionDto> responseEntity = new ResponseEntity<>(exceptionDto,HttpStatus.INTERNAL_SERVER_ERROR);
        return responseEntity;

    }

    @ExceptionHandler(ProductNotFoundExceptions.class)
    private ResponseEntity<ProductNotFoundExceptionDto> handleProductNotFoundException(ProductNotFoundExceptions exceptions){

    ProductNotFoundExceptionDto Dto = new ProductNotFoundExceptionDto();
    Dto.setMessage("product with "+exceptions.getId() +" id is not found");

        return new ResponseEntity<>(Dto,HttpStatus.NOT_FOUND);



    }
}
