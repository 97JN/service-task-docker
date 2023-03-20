package com.example.carservice.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Detail_DTO {
    private BigDecimal price;
    private String color;
    private Integer car_id;
}
