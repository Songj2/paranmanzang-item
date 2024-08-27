package com.paranmanzang.item.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "locations")
public class LocationEntity {

    private String address;
    private String sido;
    private String sigungu;
    private String zonecode;
    private String buildingName;

    @Id
    @OneToOne
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;
}
