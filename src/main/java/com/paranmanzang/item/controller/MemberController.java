package com.paranmanzang.item.controller;

import com.paranmanzang.item.model.domain.MemberModel;
import com.paranmanzang.item.model.entity.MemberEntity;
import com.paranmanzang.item.model.repository.MemberRepository;
import com.paranmanzang.item.service.impl.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members/")
public class MemberController {
    private final MemberServiceImpl memberService;
    private final MemberRepository memberRepository;

    @PostMapping("join")
    public Object join(@RequestBody MemberModel model) {

        return memberRepository.save(MemberEntity.builder()
                .username(model.getUsername())
                .password(model.getPassword())
                .tel(model.getTel())
                .build());
    }

//    @PostMapping("login")
//    public String login(@RequestBody MemberModel model){
//        Map<?,?> map= memberService.login(model);
//
//        return null;
//    }

    @GetMapping("list")
    public List<MemberEntity> findAll() {
        return memberRepository.findAll();
    }

    @GetMapping("findOne/{id}")
    public Optional<MemberEntity> findById(@PathVariable Long id) {
        return memberService.findById(id);
    }

    @GetMapping("exists/{id}")
    public boolean existsById(@PathVariable Long id) {
        return memberService.existsById(id);
    }

    @GetMapping("count")
    public long count() {
        return memberService.count();
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deleteById(@RequestParam Long id) {
        memberRepository.deleteById(id);
        return ResponseEntity.ok("deleted");
    }
}
