package com.codegym.demoorm.service;

import com.codegym.demoorm.model.Product;
import com.codegym.demoorm.repository.IGenerateRepository;

import java.util.List;

public interface IProductService extends IGenerateService<Product> {
    List<Product> findByAllPrice ( double from, double to);
}