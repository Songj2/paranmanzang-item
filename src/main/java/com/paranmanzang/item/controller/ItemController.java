package com.paranmanzang.item.controller;

import com.paranmanzang.item.model.domain.ItemModel;
import com.paranmanzang.item.model.entity.ItemEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController{

    public List<ItemModel> findAll() {
        return List.of();
    }


    public ItemEntity save(ItemModel item) {
        return null;
    }


    public Optional<ItemModel> findById(Long id) {
        return Optional.empty();
    }


    public boolean existsById(Long id) {
        return false;
    }


    public long count() {
        return 0;
    }


    public void deleteById(Long id) {

    }
}
