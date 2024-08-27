package com.paranmanzang.item.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "rooms")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int limitPeople;
    private int price;
    @ManyToOne
    @JoinColumn(name = "hotel_id") //외래키 설정
    private HotelEntity hotel;
}
