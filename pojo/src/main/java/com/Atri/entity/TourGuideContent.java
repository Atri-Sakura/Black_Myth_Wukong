package com.Atri.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class TourGuideContent {
    private Integer guideId;
    private Integer spotId;
    private String content;
    private String language;
    private LocalDateTime updateTime;
}