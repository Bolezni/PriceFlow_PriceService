package com.bolezni.priceflow_priceservice.repository;

import com.bolezni.priceflow_priceservice.model.PriceOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceOfferRepository extends JpaRepository<PriceOffer, Long> {
}
