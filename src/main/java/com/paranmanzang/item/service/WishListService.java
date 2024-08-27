package com.paranmanzang.item.service;



import com.paranmanzang.item.model.domain.WishListModel;
import com.paranmanzang.item.model.entity.WishListEntity;

import java.util.List;
import java.util.Optional;

public interface WishListService {
    List<WishListEntity> findAll();
    WishListEntity save(WishListModel item);
    Optional<WishListEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
