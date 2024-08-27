package com.paranmanzang.item.model.repository;

import com.paranmanzang.item.model.domain.MemberModel;
import com.paranmanzang.item.model.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
//    Map<?,?> login(MemberModel model);
}
