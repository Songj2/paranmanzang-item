package com.paranmanzang.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class WishListModel {
    private Long hotelId;
    private Long memberId;
}
