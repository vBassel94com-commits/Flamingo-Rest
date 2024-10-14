package com.example.flamingo.repository;

import com.example.flamingo.model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion, Long> {
    // يمكن إضافة استعلامات مخصصة هنا إن لزم الأمر
}
