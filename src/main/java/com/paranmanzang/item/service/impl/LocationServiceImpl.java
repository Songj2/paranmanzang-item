package com.paranmanzang.item.service.impl;

import com.paranmanzang.item.model.domain.LocationModel;
import com.paranmanzang.item.model.entity.LocationEntity;
import com.paranmanzang.item.model.repository.LocationRepository;
import com.paranmanzang.item.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;

    @Override
    public List<LocationEntity> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public LocationEntity save(LocationModel item) {
        LocationEntity entity = LocationEntity.builder().build();
        return locationRepository.save(entity);
    }

    @Override
    public Optional<LocationEntity> findById(Long id) {
        return locationRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return locationRepository.existsById(id);
    }

    @Override
    public long count() {
        return locationRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        locationRepository.deleteById(id);
    }
}
