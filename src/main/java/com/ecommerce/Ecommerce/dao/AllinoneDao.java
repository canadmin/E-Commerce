package com.ecommerce.Ecommerce.dao;


import com.ecommerce.Ecommerce.model.Allinone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllinoneDao  extends CrudRepository<Allinone,Long> {
    Allinone findAllById(Long id);

}
