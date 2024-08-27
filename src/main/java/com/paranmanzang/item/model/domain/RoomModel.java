package com.paranmanzang.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class RoomModel {
    private Long id;
    private Long hotelId;
    private String name;
    private int limitPeople;
    private int price;
}
