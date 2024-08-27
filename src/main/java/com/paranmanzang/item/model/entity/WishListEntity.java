package com.paranmanzang.item.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "wish_list")
public class WishListEntity {

    @Id
    @ManyToOne
    @JoinColumn(name = "member_id")
    private MemberEntity member;

    @Id
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;
}
