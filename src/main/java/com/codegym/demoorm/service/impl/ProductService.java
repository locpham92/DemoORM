package com.codegym.demoorm.service;

import com.codegym.demoorm.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
@
public class ProductService {
    @Autowired
    private IProductRepository productRepository;

}
