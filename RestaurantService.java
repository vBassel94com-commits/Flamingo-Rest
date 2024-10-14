package com.example.flamingo.service;

import com.example.flamingo.model.FoodItem;
import com.example.flamingo.model.Promotion;
import com.example.flamingo.repository.FoodItemRepository;
import com.example.flamingo.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private FoodItemRepository foodItemRepository;

    @Autowired
    private PromotionRepository promotionRepository;

    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    public List<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    public FoodItem addFoodItem(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

    public Promotion addPromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }
}
