package com.paranmanzang.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class ReservationModel {
    private Long id;
    private Date checkIn;
    private Date checkOut;
    private boolean confirmed;
    private boolean status;
    private Long roomId;
    private Long memberId;
}
