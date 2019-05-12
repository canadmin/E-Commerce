package com.ecommerce.Ecommerce.service;

import java.util.List;

public interface ComputerService<T> {
    List<T> findAll();
    void addProduct(T product);
    T findOne(Long id);
    void deleteProduct(Long id);
    T updateProduct(T product);
}
