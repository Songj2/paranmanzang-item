package com.paranmanzang.item.controller;

import com.paranmanzang.item.model.domain.ItemModel;
import com.paranmanzang.item.model.entity.ItemEntity;
import com.paranmanzang.item.service.ItemService;
import com.paranmanzang.item.service.impl.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/items/")
public class ItemController {

    private final ItemServiceImpl itemService;

    @GetMapping("list")
    public List<ItemModel> findAll() {
        return List.of();
    }

    @PostMapping("save")
    public ItemEntity save(ItemModel item) {
        return null;
    }

    @GetMapping("findOne")
    public Optional<ItemModel> findById(Long id) {
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
