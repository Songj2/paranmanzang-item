package com.paranmanzang.item.service.impl;

import com.paranmanzang.item.model.domain.ItemModel;
import com.paranmanzang.item.model.entity.ItemEntity;
import com.paranmanzang.item.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public List<ItemModel> findAll() {
        return List.of();
    }

    @Override
    public ItemEntity save(ItemModel item) {
        return null;
    }

    @Override
    public Optional<ItemModel> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {

    }
}
