package com.rest_api.fs14backend.discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DiscountService {
    @Autowired
    private DiscountRepository discountRepository;

    public List<Discount> findAll(){
        return discountRepository.findAll();
    }

    public Discount createOne(Discount discount) {
        return discountRepository.save(discount);
    }

    public void deleteById(UUID id) {
        discountRepository.deleteById(id);
    }
}
