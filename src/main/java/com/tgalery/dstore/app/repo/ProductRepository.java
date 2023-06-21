package com.tgalery.dstore.app.repo;

import com.tgalery.dstore.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query methods or additional operations can be defined here
}

