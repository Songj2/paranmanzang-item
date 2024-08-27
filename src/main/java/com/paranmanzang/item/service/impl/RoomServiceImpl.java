package com.paranmanzang.item.service.impl;

import com.paranmanzang.item.model.domain.RoomModel;
import com.paranmanzang.item.model.entity.RoomEntity;
import com.paranmanzang.item.model.repository.RoomRepository;
import com.paranmanzang.item.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {
    private final RoomRepository roomRepository;

    @Override
    public List<RoomEntity> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public RoomEntity save(RoomModel item) {
        RoomEntity entity = RoomEntity.builder().build();
        return roomRepository.save(entity);
    }

    @Override
    public Optional<RoomEntity> findById(Long id) {
        return roomRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return roomRepository.existsById(id);
    }

    @Override
    public long count() {
        return roomRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        roomRepository.deleteById(id);
    }
}
