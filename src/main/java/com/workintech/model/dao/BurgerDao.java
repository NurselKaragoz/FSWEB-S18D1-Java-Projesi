package com.workintech.model.dao;

import com.workintech.model.entity.Burger;

import java.util.List;

public interface BurgerDao {



    Burger  save(Burger burger);
    Burger findById(Long id);
   List<Burger> findAll() ;
    Burger findByPrice(Double price);
    Burger findByBreadType(String breadType);
    Burger findByContent(String content);
    Burger update(Burger burger);
    Burger delete(Burger id);

    Burger delete(Integer id);
}
