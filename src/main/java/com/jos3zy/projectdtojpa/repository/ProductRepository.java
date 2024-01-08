package com.jos3zy.projectdtojpa.repository;

import com.jos3zy.projectdtojpa.dto.closed.ProductClosedView;
import com.jos3zy.projectdtojpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<ProductClosedView> findBy();

    Optional<ProductClosedView> findProductById(Long idProduct);

}
