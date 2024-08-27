package com.paranmanzang.item.service;

import com.paranmanzang.item.model.domain.MemberModel;
import com.paranmanzang.item.model.entity.MemberEntity;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    List<MemberEntity> findAll();
    MemberEntity save(MemberModel item);
    Optional<MemberEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
