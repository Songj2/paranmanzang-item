package com.paranmanzang.item.controller;

import com.paranmanzang.item.model.domain.LocationModel;
import com.paranmanzang.item.model.entity.LocationEntity;
import com.paranmanzang.item.service.impl.LocationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/locations/")
public class LocationController{
    private final LocationServiceImpl locationService;


    @GetMapping("list")
    public List<LocationEntity> findAll() {
        return List.of();
    }

    @PostMapping("save")
    public LocationEntity save(LocationModel item) {
        return null;
    }

    @GetMapping("findOne")
    public Optional<LocationEntity> findById(Long id) {
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
