package com.Atri.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class DataStatistics {
    private Integer statisticsId;
    private LocalDateTime statisticsTime;
    private Integer userCount;
    private Integer synthesizedVideoTotal;
    private Integer shareTotal;
    private Integer activeUserCount;
    private Integer newUserCount;
    private BigDecimal averageRating;
}