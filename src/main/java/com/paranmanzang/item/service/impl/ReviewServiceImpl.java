package com.paranmanzang.item.service.impl;

import com.paranmanzang.item.model.domain.ReviewModel;
import com.paranmanzang.item.model.entity.ReviewEntity;
import com.paranmanzang.item.model.repository.ReviewRepository;
import com.paranmanzang.item.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    @Override
    public List<ReviewEntity> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public ReviewEntity save(ReviewModel item) {
        ReviewEntity entity = ReviewEntity.builder().build();
        return reviewRepository.save(entity);
    }

    @Override
    public Optional<ReviewEntity> findById(Long id) {
        return reviewRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return reviewRepository.existsById(id);
    }

    @Override
    public long count() {
        return reviewRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        reviewRepository.deleteById(id);
    }
}
