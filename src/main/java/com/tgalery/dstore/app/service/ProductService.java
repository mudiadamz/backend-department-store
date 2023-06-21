package com.tgalery.dstore.app.service;

import com.tgalery.dstore.app.model.Product;
import com.tgalery.dstore.app.repo.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Other methods for product management (e.g., createProduct, updateProduct, deleteProduct, etc.)
}

