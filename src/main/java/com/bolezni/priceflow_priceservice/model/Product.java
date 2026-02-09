package com.bolezni.priceflow_priceservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.Map;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "products")
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String normalizedSku;

    private String name; // "Samsung 980 Pro 1TB NVMe M.2 SSD"

    // Бренд
    private String brand; // "Samsung"

    // Категория (можно иерархию, но для MVP — строка)
    private String category; // "SSD", "Electronics > Storage"

    // Характеристики в JSON (гибко для разных категорий)
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private Map<String, String> specs;
    // Пример: { "capacity": "1TB", "interface": "NVMe", "form_factor": "M.2" }

    // EAN / GTIN / UPC (если есть)
    private String ean;

    // Артикул производителя (MPN)
    private String mpn;

    // Дата создания
    private LocalDateTime createdAt = LocalDateTime.now();


}
