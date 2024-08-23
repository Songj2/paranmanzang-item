package com.paranmanzang.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ItemModel {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String publisher;
    private Long price;

}

