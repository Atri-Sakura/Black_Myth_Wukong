package com.Atri.entity;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Audit {
    private Integer auditId;
    private Integer contentId;
    private String auditStatus;
    private LocalDateTime auditTime;
    private String auditor;
    private String reason;
}