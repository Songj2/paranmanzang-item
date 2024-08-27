package com.paranmanzang.item.controller;

import com.paranmanzang.item.model.domain.WishListModel;
import com.paranmanzang.item.model.entity.WishListEntity;
import com.paranmanzang.item.service.WishListService;
import com.paranmanzang.item.service.impl.WishListServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/wishlists/")
public class WishListController {
    private final WishListServiceImpl wishListService;

    @GetMapping("list")
    public List<WishListEntity> findAll() {
        return List.of();
    }

    @PostMapping("save")
    public WishListEntity save(WishListModel item) {
        return null;
    }

    @GetMapping("findOne")
    public Optional<WishListEntity> findById(Long id) {
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
