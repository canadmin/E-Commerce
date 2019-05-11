package com.ecommerce.Ecommerce.service;

import com.ecommerce.Ecommerce.model.Laptop;

import java.util.List;

public interface LaptopService {
    List<Laptop> findAll();
    void addLaptop(Laptop laptop);
    Laptop findOne(Long id);
    void deleteLaptop(Long id);
    Laptop updateLaptop(Laptop laptop);
}
