package com.Atri.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ShareContent {
    private Integer contentId;
    private Integer userId;
    private Integer spotId;
    private String contentType;
    private String contentPreview;
    private LocalDateTime submitTime;
    private String status;
}


