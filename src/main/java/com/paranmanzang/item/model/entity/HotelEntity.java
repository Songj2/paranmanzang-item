package com.paranmanzang.item.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "hotels")
public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long memberId;
    private String name;
    private String tel;
    private float rating;
    private String content;
    @OneToMany(mappedBy = "hotel") // mappedBy는 instance 이름, table 명이 아니라 hotel instance 1개에 room이 딸려옴
    private List<RoomEntity> rooms;
    @OneToMany(mappedBy = "hotel")
    private List<WishListEntity> wishes;

    @OneToOne
    private LocationEntity location;
}
