package com.Atri.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Notification {
    private Integer notificationId;
    private Integer userId;
    private String content;
    private LocalDateTime sendTime;
    private String status;
}

