package com.paranmanzang.item.service;

import com.paranmanzang.item.model.domain.ReservationModel;
import com.paranmanzang.item.model.entity.ReservationEntity;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    List<ReservationEntity> findAll();
    ReservationEntity save(ReservationModel item);
    Optional<ReservationEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
