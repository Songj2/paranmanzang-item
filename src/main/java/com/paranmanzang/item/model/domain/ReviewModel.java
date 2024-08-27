package com.paranmanzang.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class ReviewModel {
    private Long id;
    private Long reservationId;
    private String comment;
    private float rating;
    private Date createdAt;
    private Date updatedAt;
    private Long memberId;
}
