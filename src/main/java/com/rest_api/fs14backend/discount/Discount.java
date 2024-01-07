package com.rest_api.fs14backend.discount;

import com.rest_api.fs14backend.status.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity(name = "discount")
@Table(name = "discount")
@Data
@NoArgsConstructor
public class Discount {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    @Column(nullable = false, columnDefinition = "varchar(25)")
    private String name;
    @Column(nullable = false, columnDefinition = "varchar(25)")
    private String discountCoupon;
    @Column(nullable = false)
    private int percentage;
    @Column(nullable = false)
    private boolean active;
    @ManyToOne(optional = false)
    private Status status;

    public Discount(String name, String discountCoupon, int percentage, boolean active) {
        this.name = name;
        this.discountCoupon = discountCoupon;
        this.percentage = percentage;
        this.active = active;
    }
}
