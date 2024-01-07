package com.rest_api.fs14backend.order;

import com.rest_api.fs14backend.cart.Cart;
import com.rest_api.fs14backend.payment.Payment;
import com.rest_api.fs14backend.product.Product;
import com.rest_api.fs14backend.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "order")
@Table(name = "order")
@Data
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    @OneToOne
    private User user;
    private Product product;
    private BigDecimal total;
    private int quantity;
    private Payment payment;
    private String shipmentDate;
    private String status;
    private boolean isCompleted;

    public Order(BigDecimal total, int quantity, String shipmentDate, String status, boolean isCompleted) {
        this.total = total;
        this.quantity = quantity;
        this.shipmentDate = shipmentDate;
        this.status = status;
        this.isCompleted = isCompleted;
    }

}
