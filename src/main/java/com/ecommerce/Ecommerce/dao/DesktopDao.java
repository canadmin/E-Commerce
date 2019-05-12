package com.ecommerce.Ecommerce.dao;

import com.ecommerce.Ecommerce.model.Desktop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopDao extends CrudRepository<Desktop,Long> {
    Desktop findAllById(Long id);

}
