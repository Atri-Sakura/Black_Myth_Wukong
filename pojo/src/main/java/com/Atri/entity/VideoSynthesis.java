package com.Atri.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class VideoSynthesis {
    private Integer videoId;
    private Integer userId;
    private Integer spotId;
    private LocalDateTime synthesisTime;
    private String videoPath;
    private String style;
    private String specialEffects;
    private String status;  // 建议使用枚举
}

