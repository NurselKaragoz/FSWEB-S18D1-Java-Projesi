package com.workintech.model.dao;

import com.workintech.model.entity.Burger;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BurgerDaoImpl implements BurgerDao{
    private EntityManager entityManager;
    @Override
    public Burger save(Burger burger) {
        return null;
    }

    @Override
    public Burger findById(Long id) {
        return null;
    }



    @Override
    public List<Burger> findAll() {
            TypedQuery<Burger> query = entityManager.createQuery("SELECT b FROM Burger b", Burger.class);
            return query.getResultList();
        }



    @Override
    public Burger findByPrice(Double price) {
        return null;
    }

    @Override
    public Burger findByBreadType(String breadType) {
        return null;
    }

    @Override
    public Burger findByContent(String content) {
        return null;
    }

    @Override
    public Burger update(Burger burger) {
        return null;
    }

    @Override
    public Burger delete(Burger id) {
        return null;
    }

    @Override
    public Burger delete(Integer id) {
        return null;
    }
}
