package com.paranmanzang.item.service;

import com.paranmanzang.item.model.domain.RoomModel;
import com.paranmanzang.item.model.entity.RoomEntity;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    List<RoomEntity> findAll();
    RoomEntity save(RoomModel item);
    Optional<RoomEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
