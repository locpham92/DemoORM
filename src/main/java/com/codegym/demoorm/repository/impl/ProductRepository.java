package com.codegym.demoorm.repository.impl;

import com.codegym.demoorm.model.Product;
import com.codegym.demoorm.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class ProductRepository implements IProductRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Product> findAll() {
        String queryStr = "SELECT p FROM Product AS p";
        TypedQuery<Product> query = entityManager.createQuery(queryStr, Product.class);
        return query.getResultList();
    }

    @Override
    public Product findById(Long id) {
        String queryStr = "SELECT p FROM Product AS p WHERE p.id =:id";
        TypedQuery<Product> query = entityManager.createQuery(queryStr, Product.class);
        query.setParameter("id", id);
        return query.getSingleResult(); //Lay 1 gia tri ket qua
    }
    @Override
    public List<Product> findByName(String name) {
        String queryStr = "SELECT p FROM Product AS p WHERE p.name like %name%";
        TypedQuery<Product> query = entityManager.createQuery(queryStr, Product.class);
        query.setParameter("name", name);
        return query.getResultList();
    }

    @Override
    public void save(Product product) {
        if (product.getId() != null) {
            entityManager.merge(product);
        }
        else {
            entityManager.persist(product);
        }

    }

    @Override
    public void remove(Long id) {
        Product product = findById(id);
        if (product != null) {
            entityManager.remove(product);
        }

    }

    @Override
    public List<Product> findByAllPrice(double from, double to) {
       return null;
    }
}
