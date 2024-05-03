package com.codegym.demoorm.repository;

import com.codegym.demoorm.model.Product;

import java.util.List;

public interface IProductRepository extends IGenerateRepository<Product> {
    List<Product> findByAllPrice(double from, double to);

}
