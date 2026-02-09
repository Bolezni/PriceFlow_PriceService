package com.bolezni.priceflow_priceservice.repository;

import com.bolezni.priceflow_priceservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
