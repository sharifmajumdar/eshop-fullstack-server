package com.rest_api.fs14backend.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "product")
@Table(name = "product")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String name;
    private String description;
    private String categories;
    private String variants;
    private int quantity;
    private String sizes;
    private BigDecimal price;
    private String image;
    private String imageAlt;

    public Product(String name, String description, String categories, String variants, int quantity, String sizes, BigDecimal price, String image, String imageAlt) {
        this.name = name;
        this.description = description;
        this.categories = categories;
        this.variants = variants;
        this.quantity = quantity;
        this.sizes = sizes;
        this.price = price;
        this.image = image;
        this.imageAlt = imageAlt;
    }
}
