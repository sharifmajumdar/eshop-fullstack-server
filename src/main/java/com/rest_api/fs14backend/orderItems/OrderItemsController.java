package com.rest_api.fs14backend.orderItems;

import com.rest_api.fs14backend.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/orderItems")
public class OrderItemsController {
    @Autowired
    private OrderItemsService orderItemsService;

    @GetMapping("/")
    public List<OrderItems> findAll() {
        return orderItemsService.findAll();
    }
    @PostMapping("/")
    public OrderItems createOne(@RequestBody OrderItems orderItems) {
        return orderItemsService.createOne(orderItems);
    }
}
