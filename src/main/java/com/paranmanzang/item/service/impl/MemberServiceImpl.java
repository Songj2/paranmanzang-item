package com.paranmanzang.item.service.impl;

import com.paranmanzang.item.model.domain.MemberModel;
import com.paranmanzang.item.model.entity.MemberEntity;
import com.paranmanzang.item.model.repository.MemberRepository;
import com.paranmanzang.item.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    @Override
    public List<MemberEntity> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public MemberEntity save(MemberModel item) {
        MemberEntity entity= MemberEntity.builder().build();
        return memberRepository.save(entity);
    }

    @Override
    public Optional<MemberEntity> findById(Long id) {
        return memberRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return memberRepository.existsById(id);
    }

    @Override
    public long count() {
        return memberRepository.count();
    }

    @Override
    public void deleteById(Long id) {
memberRepository.existsById(id);
    }

    @Override
    public Map<?, ?> login(MemberModel model) {
        Map<?,?> map=new HashMap<>();
//                memberRepository.login(model);
        return map;
    }
}
