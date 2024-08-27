package com.paranmanzang.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class HotelModel {
    private Long id;
    private Long memberId;
    private String name;
    private String tel;
    private float rating;
    private String content;
}
