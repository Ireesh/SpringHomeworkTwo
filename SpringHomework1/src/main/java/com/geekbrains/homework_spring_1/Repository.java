package com.geekbrains.homework_spring_1;

import java.util.List;

public interface Repository {
    List<Product> getAllProducts();
    Product getProductById(int id);
    void addProduct(Product product);
}
