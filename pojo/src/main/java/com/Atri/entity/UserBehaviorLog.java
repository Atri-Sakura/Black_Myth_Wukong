package com.Atri.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class UserBehaviorLog {
    private Integer logId;
    private Integer userId;
    private String action;
    private LocalDateTime actionTime;
    private String details;
}