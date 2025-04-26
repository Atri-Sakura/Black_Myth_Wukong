package com.Atri.entity;
import lombok.Data;
import java.util.List;

@Data
public class ScenicSpot {
    private Integer spotId;
    private String spotName;
    private String description;
    private String location;
    private String realImage;
    private String gameImage;
    private Integer templateCount;
    private String status;  // 建议使用枚举
    private String tags;     // 或使用List<String>
}

