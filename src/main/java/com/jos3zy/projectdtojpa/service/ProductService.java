package com.jos3zy.projectdtojpa.service;

import com.jos3zy.projectdtojpa.dto.closed.ProductClosedView;
import com.jos3zy.projectdtojpa.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    List<ProductClosedView> findBy();
}
