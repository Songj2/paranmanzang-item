package com.paranmanzang.item.service;


import com.paranmanzang.item.model.domain.ReviewModel;
import com.paranmanzang.item.model.entity.ReviewEntity;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    List<ReviewEntity> findAll();
    ReviewEntity save(ReviewModel item);
    Optional<ReviewEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
