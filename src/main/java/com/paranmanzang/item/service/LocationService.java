package com.paranmanzang.item.service;

import com.paranmanzang.item.model.domain.LocationModel;
import com.paranmanzang.item.model.entity.LocationEntity;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    List<LocationEntity> findAll();
    LocationEntity save(LocationModel item);
    Optional<LocationEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
