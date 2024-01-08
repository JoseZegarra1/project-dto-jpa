package com.jos3zy.projectdtojpa.service;

import com.jos3zy.projectdtojpa.dto.closed.ProductClosedView;
import com.jos3zy.projectdtojpa.entity.Product;
import com.jos3zy.projectdtojpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductClosedView> findBy() {
        return productRepository.findBy();
    }
}
