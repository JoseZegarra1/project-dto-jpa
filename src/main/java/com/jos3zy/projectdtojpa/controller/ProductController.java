package com.jos3zy.projectdtojpa.controller;


import com.jos3zy.projectdtojpa.dto.closed.ProductClosedView;
import com.jos3zy.projectdtojpa.entity.Product;
import com.jos3zy.projectdtojpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/findAll")
    public List<Product> findAll(){
       return productService.findAll();
    }

@GetMapping("/findAllProductViewClosed")
    public List<ProductClosedView> findAllProductViewClosed(){
       return productService.findBy();
    }

    @GetMapping("/findProductById/{idProduct}")
    public Optional<ProductClosedView> findProductById(@PathVariable Long idProduct){
       return productService.findProductByIdProduct(idProduct);
    }
}
