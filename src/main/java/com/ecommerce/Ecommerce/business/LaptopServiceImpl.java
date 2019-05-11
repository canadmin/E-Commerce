package com.ecommerce.Ecommerce.business;

import com.ecommerce.Ecommerce.dao.LaptopDao;
import com.ecommerce.Ecommerce.model.Laptop;
import com.ecommerce.Ecommerce.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    private LaptopDao laptopDao;

    @Autowired
    public LaptopServiceImpl(LaptopDao laptopDao) {
        this.laptopDao = laptopDao;
    }

    @Override
    public List<Laptop> findAll() {
        List<Laptop> laptops= (List<Laptop>) laptopDao.findAll();
        return laptops;
    }

    @Override
    public void addLaptop(Laptop laptop) {
        laptopDao.save(laptop);

    }

    @Override
    public Laptop findOne(Long id) {
        Laptop laptop=laptopDao.findAllById(id);
        return laptop;
    }

    @Override
    public void deleteLaptop(Long id) {
        laptopDao.deleteById(id);
    }

    @Override
    public Laptop updateLaptop(Laptop laptop) {
        Laptop laptop1=laptopDao.save(laptop);
        return laptop1;
    }
}
