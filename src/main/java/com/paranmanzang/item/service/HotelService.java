package com.paranmanzang.item.service;

import com.paranmanzang.item.model.domain.HotelModel;
import com.paranmanzang.item.model.entity.HotelEntity;

import java.util.List;
import java.util.Optional;

public interface HotelService {
    List<HotelEntity> findAll();
    HotelEntity save(HotelModel item);
    Optional<HotelEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
