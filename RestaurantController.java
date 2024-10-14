package com.example.flamingo.controller;

import com.example.flamingo.model.FoodItem;
import com.example.flamingo.model.Promotion;
import com.example.flamingo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/food-items")
    public List<FoodItem> getFoodItems() {
        return restaurantService.getAllFoodItems();
    }

    @GetMapping("/promotions")
    public List<Promotion> getPromotions() {
        return restaurantService.getAllPromotions();
    }

    @PostMapping("/food-items")
    public FoodItem createFoodItem(@RequestBody FoodItem foodItem) {
        return restaurantService.addFoodItem(foodItem);
    }

    @PostMapping("/promotions")
    public Promotion createPromotion(@RequestBody Promotion promotion) {
        return restaurantService.addPromotion(promotion);
    }
}
