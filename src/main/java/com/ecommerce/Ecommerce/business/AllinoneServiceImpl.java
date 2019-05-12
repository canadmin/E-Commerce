package com.ecommerce.Ecommerce.business;

import com.ecommerce.Ecommerce.dao.AllinoneDao;
import com.ecommerce.Ecommerce.model.Allinone;
import com.ecommerce.Ecommerce.service.ComputerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllinoneServiceImpl implements ComputerService<Allinone> {
    private AllinoneDao allinoneDao;

    public AllinoneServiceImpl(AllinoneDao allinoneDao) {
        this.allinoneDao = allinoneDao;
    }

    @Override
    public List<Allinone> findAll() {
        List<Allinone> allinones= (List<Allinone>) allinoneDao.findAll();
        return allinones;
    }

    @Override
    public void addProduct(Allinone product) {
        allinoneDao.save(product);
    }

    @Override
    public Allinone findOne(Long id) {
        Allinone allinone=allinoneDao.findAllById(id);
        return allinone;
    }

    @Override
    public void deleteProduct(Long id) {
        allinoneDao.deleteById(id);
    }

    @Override
    public Allinone updateProduct(Allinone product) {
      Allinone allinone=  allinoneDao.save(product);
        return allinone;
    }
}
