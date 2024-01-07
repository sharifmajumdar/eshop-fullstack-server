package com.rest_api.fs14backend.discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/discount")
public class DiscountController {
    @Autowired
    private DiscountService discountService;

    @GetMapping("/")
    public List<Discount> findAll(){
        return discountService.findAll();
    }

    @PostMapping("/")
    public Discount createOne(@RequestBody Discount discount) {
        return discountService.createOne(discount);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable UUID id) {
        discountService.deleteById(id);
    }
}
