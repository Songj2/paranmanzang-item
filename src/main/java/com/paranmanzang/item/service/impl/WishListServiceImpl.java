package com.paranmanzang.item.service.impl;

import com.paranmanzang.item.model.domain.WishListModel;
import com.paranmanzang.item.model.entity.WishListEntity;
import com.paranmanzang.item.model.repository.WishListRepository;
import com.paranmanzang.item.service.WishListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WishListServiceImpl implements WishListService {
    private final WishListRepository wishListRepository;

    @Override
    public List<WishListEntity> findAll() {
        return wishListRepository.findAll();
    }

    @Override
    public WishListEntity save(WishListModel item) {
        WishListEntity entity = WishListEntity.builder().build();
        return wishListRepository.save(entity);
    }

    @Override
    public Optional<WishListEntity> findById(Long id) {
        return wishListRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return wishListRepository.existsById(id);
    }

    @Override
    public long count() {
        return wishListRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        wishListRepository.deleteById(id);
    }
}
