package com.devmarvin.ecommerce.application.repository;

import com.devmarvin.ecommerce.domain.Product;
import com.devmarvin.ecommerce.domain.User;

public interface ProductRepository {
    Iterable<Product> getProducts();
    Iterable<Product> getProductsByUser(User user);
    Product getProductById(Integer id);
    Product saveProduct(Product product);
    void deleteProductById(Integer id);
}
