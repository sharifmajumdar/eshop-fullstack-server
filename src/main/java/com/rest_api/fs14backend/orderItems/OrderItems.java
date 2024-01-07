package com.rest_api.fs14backend.orderItems;

import com.rest_api.fs14backend.order.Order;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity(name = "orderItems")
@Table(name = "orderItems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItems {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private Order order;
}
