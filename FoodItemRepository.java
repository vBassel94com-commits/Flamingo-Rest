package com.example.flamingo.repository;

import com.example.flamingo.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    // يمكن إضافة استعلامات مخصصة هنا إن لزم الأمر
}
