package com.rest_api.fs14backend.orderItems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemsService {
    @Autowired
    private OrderItemsRepository orderItemsRepository;

    public List<OrderItems> findAll(){
        return orderItemsRepository.findAll();
    }

    public OrderItems createOne(OrderItems orderItems){
        return orderItemsRepository.save(orderItems);
    }
}
