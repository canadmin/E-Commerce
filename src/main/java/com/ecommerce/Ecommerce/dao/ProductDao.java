package com.ecommerce.Ecommerce.dao;

import com.ecommerce.Ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Long> {

}
