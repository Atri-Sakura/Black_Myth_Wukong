package com.Atri.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class RatingRecord {
    private Integer recordId;
    private Integer userId;
    private BigDecimal ratingScore;
    private LocalDateTime ratingTime;
    private String feedback;
}