package com.bolezni.priceflow_priceservice.repository;

import com.bolezni.priceflow_priceservice.model.TrackedProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackedProductRepository extends JpaRepository<TrackedProduct, Long> {
}
