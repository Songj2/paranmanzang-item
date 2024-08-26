package com.paranmanzang.item.service.impl;

import com.paranmanzang.item.model.domain.ItemModel;
import com.paranmanzang.item.model.entity.ItemEntity;
import com.paranmanzang.item.model.repository.ItemRepository;
import com.paranmanzang.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {


    private final ItemRepository itemRepository;

    @Override
    public List<ItemEntity> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public ItemEntity save(ItemModel item) {
        ItemEntity entity= new ItemEntity();

        return itemRepository.save(entity);
    }

    @Override
    public Optional<ItemEntity> findById(Long id) {
        return itemRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return itemRepository.existsById(id);
    }

    @Override
    public long count() {
        return itemRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }
}
