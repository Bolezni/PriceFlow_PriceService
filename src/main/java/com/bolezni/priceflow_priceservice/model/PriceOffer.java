package com.bolezni.priceflow_priceservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Builder
@EqualsAndHashCode
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "price_offer")
@Entity
public class PriceOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Ссылка на нормализованный товар
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    // Источник (маркетплейс)
    @Enumerated(EnumType.STRING)
    private Marketplace marketplace;

    // Внешний ID товара на маркетплейсе
    private String externalId;

    //URL страница товара
    private String url;

    private BigDecimal price;

    @Column(name = "delivery_cost")
    private BigDecimal deliveryCost;

    private BigDecimal totalPrice;

    //Наличие
    private Integer stock;

    //Данные продавца на маркетплейсе
    @Column(name = "seller_name")
    private String sellerName;
    @Column(name = "seller_id")
    private String sellerId;

    //Партнерская ссылка
    @Column(name = "affiliate_url")
    private String affiliateUrl;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Builder.Default
    @Column(name = "is_active")
    private boolean isActive = true;
}
