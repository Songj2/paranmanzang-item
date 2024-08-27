package com.paranmanzang.item.controller;

import com.paranmanzang.item.model.domain.LocationModel;
import com.paranmanzang.item.model.entity.LocationEntity;
import com.paranmanzang.item.model.repository.LocationRepository;
import com.paranmanzang.item.service.LocationService;
import com.paranmanzang.item.service.impl.LocationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/locations/")
public class LocationController {
    private final LocationServiceImpl locationService;
    private final LocationRepository locationRepository;


    @GetMapping("list")
    public List<LocationEntity> findAll() {
        return locationRepository.findAll();
    }

    @PostMapping("save")
    public LocationEntity save(@RequestBody LocationModel model) {
        return locationRepository.save(LocationEntity.builder()
                .address(model.getAddress())
                .sido(model.getSido())
                .sigungu(model.getSigungu())
                .buildingName(model.getBuildingName())
                .zonecode(model.getZonecode())
                .build());
    }

    @GetMapping("findOne/{id}")
    public Optional<LocationEntity> findById(@PathVariable Long id) {
        return locationService.findById(id);
    }

    @GetMapping("exists")
    public boolean existsById(@RequestParam Long id) {
        return locationService.existsById(id);
    }

    @GetMapping("count")
    public long count() {
        return locationService.count();
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deleteById(@RequestParam Long id) {
        locationRepository.deleteById(id);
        return ResponseEntity.ok("deleted");
    }
}
