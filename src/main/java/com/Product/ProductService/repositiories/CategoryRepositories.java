package com.Product.ProductService.repositiories;

import com.Product.ProductService.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositories extends JpaRepository<Category,Long> {

}
