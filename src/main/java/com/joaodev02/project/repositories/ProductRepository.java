package com.joaodev02.project.repositories;

import com.joaodev02.project.entities.Category;
import com.joaodev02.project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
