package com.paranmanzang.item.controller;

import com.paranmanzang.item.model.domain.MemberModel;
import com.paranmanzang.item.model.entity.MemberEntity;
import com.paranmanzang.item.service.impl.MemberServiceImpl;
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
@RequestMapping("/members/")
public class MemberController {
    private final MemberServiceImpl memberService;
    @GetMapping("list")
    public List<MemberEntity> findAll() {
        return List.of();
    }

    @PostMapping("save")
    public MemberEntity save(MemberModel item) {
        return null;
    }

    @GetMapping("findOne")
    public Optional<MemberEntity> findById(Long id) {
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
