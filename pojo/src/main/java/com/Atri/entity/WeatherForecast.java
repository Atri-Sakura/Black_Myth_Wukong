package com.Atri.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class WeatherForecast {
    private Integer forecastId;
    private Integer spotId;
    private LocalDate forecastDate;
    private BigDecimal temperature;
    private String weatherCondition;
    private BigDecimal precipitationProb;
    private LocalDateTime updateTime;
}