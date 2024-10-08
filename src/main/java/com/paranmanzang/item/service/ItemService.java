package com.paranmanzang.item.service;

import com.paranmanzang.item.model.domain.ItemModel;
import com.paranmanzang.item.model.entity.ItemEntity;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<ItemEntity> findAll();
    ItemEntity save(ItemModel item);
    Optional<ItemEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
