package com.paranmanzang.item.service.impl;

import com.paranmanzang.item.model.domain.HotelModel;
import com.paranmanzang.item.model.entity.HotelEntity;
import com.paranmanzang.item.model.repository.HotelRepository;
import com.paranmanzang.item.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;
    @Override
    public List<HotelEntity> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public HotelEntity save(HotelModel item) {
        HotelEntity entity= HotelEntity.builder().build();
        return hotelRepository.save(entity);
    }

    @Override
    public Optional<HotelEntity> findById(Long id) {
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
