package com.ecommerce.Ecommerce.dao;

import com.ecommerce.Ecommerce.model.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopDao extends CrudRepository<Laptop,Long> {
    Laptop findAllById(Long id);

}
