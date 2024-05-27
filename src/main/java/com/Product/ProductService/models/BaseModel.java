package com.Product.ProductService.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
// for joined class
//@Inheritance(strategy = InheritanceType.JOINED)
//@PrimaryKeyJoinColumn(name = "user_Id")

// for single Table-------------------------------------
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "user_type",
//        discriminatorType = DiscriminatorType.INTEGER)
//
//@DiscriminatorValue(value = "0")

//Table per class-------------------------
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class BaseModel {
    @Id
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
