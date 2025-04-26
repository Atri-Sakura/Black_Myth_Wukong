package com.Atri.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ScenicSpotManagement {
    private Integer managementId;
    private Integer spotId;
    private Integer managerId;
    private LocalDateTime manageTime;
    private String action;
}

