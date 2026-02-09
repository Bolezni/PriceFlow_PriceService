package com.bolezni.priceflow_priceservice.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tracked_product")
@Entity
public class TrackedProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, name = "normalized_sku")
    private String normalizedSku;

    @Column(name = "wb_nm")
    private Long wbNm;
    @Column(name = "ozon_id")
    private Long ozonId;
    @Column(name = "yandex_sku")
    private String yandexSku;
    @Builder.Default
    private boolean enabled = true;

    private LocalDateTime lastParsing;
}
