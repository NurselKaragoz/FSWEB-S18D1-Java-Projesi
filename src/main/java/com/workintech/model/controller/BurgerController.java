package com.workintech.model.controller;


import com.workintech.model.dao.BurgerDao;
import com.workintech.model.entity.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")

public class BurgerController {
    private BurgerDao burgerDao;

    @Autowired
    public BurgerController(BurgerDao burgerDao) {
        this.burgerDao = burgerDao;
    }

    @GetMapping("/")
    public List<Burger> allBurgers() {
        return burgerDao.findAll();
    }
    @GetMapping("{id]")
    public List<Burger> allBurgers(@PathVariable Integer id) {
        return burgerDao.findAll();
    }
    @PostMapping("/")
    public Burger save(@RequestBody Burger burger) {
        Burger save = burgerDao.save(burger);
        return save;
    }
    @PutMapping("/")
    public Burger update(@RequestBody Burger burger) {
        return burgerDao.update(burger);
    }

    @DeleteMapping("/{id}")
    public Burger delete(@PathVariable Integer id) {
        return burgerDao.delete(id);
    }
}
