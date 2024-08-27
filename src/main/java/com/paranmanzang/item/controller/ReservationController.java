package com.paranmanzang.item.controller;

import com.paranmanzang.item.model.domain.ReservationModel;
import com.paranmanzang.item.model.entity.ReservationEntity;
import com.paranmanzang.item.service.impl.ReservationServiceImpl;
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
@RequestMapping("/reservations/")
public class ReservationController{
    private final ReservationServiceImpl reservationService;

    @GetMapping("list")
    public List<ReservationEntity> findAll() {
        return List.of();
    }

    @PostMapping("save")
    public ReservationEntity save(ReservationModel item) {
        return null;
    }

    @GetMapping("findOne")
    public Optional<ReservationEntity> findById(Long id) {
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
