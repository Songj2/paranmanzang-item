package com.paranmanzang.item.controller;

import com.paranmanzang.item.model.domain.RoomModel;
import com.paranmanzang.item.model.entity.RoomEntity;
import com.paranmanzang.item.service.impl.RoomServiceImpl;
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
@RequestMapping("/rooms/")
public class RoomController  {
    private final RoomServiceImpl roomService;

    @GetMapping("list")
    public List<RoomEntity> findAll() {
        return List.of();
    }

    @PostMapping("save")
    public RoomEntity save(RoomModel item) {
        return null;
    }

    @GetMapping("findOne")
    public Optional<RoomEntity> findById(Long id) {
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
