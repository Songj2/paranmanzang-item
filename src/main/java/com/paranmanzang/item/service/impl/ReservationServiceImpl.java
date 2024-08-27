package com.paranmanzang.item.service.impl;

import com.paranmanzang.item.model.domain.ReservationModel;
import com.paranmanzang.item.model.entity.ReservationEntity;
import com.paranmanzang.item.model.repository.ReservationRepository;
import com.paranmanzang.item.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    private final ReservationRepository reservationRepository;

    @Override
    public List<ReservationEntity> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public ReservationEntity save(ReservationModel item) {
        ReservationEntity entity = ReservationEntity.builder().build();
        return reservationRepository.save(entity);
    }

    @Override
    public Optional<ReservationEntity> findById(Long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return reservationRepository.existsById(id);
    }

    @Override
    public long count() {
        return reservationRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        reservationRepository.deleteById(id);
    }
}
