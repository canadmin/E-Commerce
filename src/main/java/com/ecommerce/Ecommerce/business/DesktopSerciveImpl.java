package com.ecommerce.Ecommerce.business;

import com.ecommerce.Ecommerce.dao.DesktopDao;
import com.ecommerce.Ecommerce.model.Desktop;
import com.ecommerce.Ecommerce.service.ComputerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesktopSerciveImpl implements ComputerService<Desktop> {

    private DesktopDao desktopDao;

    public DesktopSerciveImpl(DesktopDao desktopDao) {
        this.desktopDao = desktopDao;
    }

    @Override
    public List<Desktop> findAll() {
        List<Desktop> desktops= (List<Desktop>) desktopDao.findAll();
        return desktops;
    }

    @Override
    public void addProduct(Desktop product) {
    desktopDao.save(product);
    }

    @Override
    public Desktop findOne(Long id) {
        Desktop desktop=desktopDao.findAllById(id);
        return desktop;
    }

    @Override
    public void deleteProduct(Long id) {
        desktopDao.deleteById(id);
    }

    @Override
    public Desktop updateProduct(Desktop product) {
        Desktop desktop=desktopDao.save(product);
        return desktop;
    }
}
