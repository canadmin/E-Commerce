package com.ecommerce.Ecommerce.business;

import com.ecommerce.Ecommerce.dao.ProductDao;
import com.ecommerce.Ecommerce.model.Product;
import com.ecommerce.Ecommerce.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    // constructor injection
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public boolean addProduct(Product product) {
            productDao.save(product);
            return true;

    }
}
