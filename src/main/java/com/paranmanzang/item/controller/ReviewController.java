package com.paranmanzang.item.controller;

import com.paranmanzang.item.model.domain.ReviewModel;
import com.paranmanzang.item.model.entity.ReviewEntity;
import com.paranmanzang.item.service.ReviewService;
import com.paranmanzang.item.service.impl.ReviewServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews/")
public class ReviewController {
    private final ReviewServiceImpl reviewService;

    @GetMapping("list")
    public List<ReviewEntity> findAll() {
        return List.of();
    }

    @PostMapping("save")
    public ReviewEntity save(ReviewModel item) {
        return null;
    }

    @GetMapping("findOne")
    public Optional<ReviewEntity> findById(Long id) {
        return Optional.empty();
    }

    @GetMapping("exists")
    public boolean existsById(Long id) {
        return false;
    }

    @GetMapping("count")
    public long count() {
        return 0;
    }

    @DeleteMapping("delete")
    public void deleteById(Long id) {

    }
}
