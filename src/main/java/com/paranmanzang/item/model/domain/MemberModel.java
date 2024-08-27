package com.paranmanzang.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class MemberModel {
    private Long id;
    private String username;
    private String password;
    private String tel;
}
