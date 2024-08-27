package com.paranmanzang.item.controller;

import com.paranmanzang.item.model.domain.HotelModel;
import com.paranmanzang.item.model.entity.HotelEntity;
import com.paranmanzang.item.model.repository.HotelRepository;
import com.paranmanzang.item.service.HotelService;
import com.paranmanzang.item.service.impl.HotelServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotels/")
public class HotelController{

    private final HotelServiceImpl hotelService;
    private final HotelRepository hotelRepository;
    @GetMapping("list")
    public List<HotelEntity> findAll() {
        return List.of();
    }

    @PostMapping("save")
    public HotelEntity save(HotelModel item) {
        return null;
    }

    @GetMapping("findOne")
    public Optional<HotelEntity> findById(Long id) {
        return Optional.empty();
    }

    @GetMapping("exists")
    public boolean existsById(Long id) {
        return false;
    }

    @GetMapping("count")
    public long count() {
        return 0;
    }

    @DeleteMapping("delete")
    public void deleteById(Long id) {

    }
}
