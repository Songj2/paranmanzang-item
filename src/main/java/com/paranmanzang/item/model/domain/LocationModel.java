package com.paranmanzang.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class LocationModel {
    private Long hotelId;
    private String address;
    private String sido;
    private String sigungu;
    private String zonecode;
    private String buildingName;
}
