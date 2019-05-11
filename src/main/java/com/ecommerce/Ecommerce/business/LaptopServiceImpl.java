package com.ecommerce.Ecommerce.business;

import com.ecommerce.Ecommerce.dao.LaptopDao;
import com.ecommerce.Ecommerce.model.Laptop;
import com.ecommerce.Ecommerce.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopServiceImpl implements LaptopService {

    private LaptopDao laptopDao;

    @Autowired
    public LaptopServiceImpl(LaptopDao laptopDao) {
        this.laptopDao = laptopDao;
    }

    @Override
    public void addLaptop(Laptop laptop) {
        laptopDao.save(laptop);

    }
}
