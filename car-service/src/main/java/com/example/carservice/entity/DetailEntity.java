package com.example.carservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailEntity implements Serializable {
    public DetailEntity(BigDecimal price, String color, CarEntity car) {
        this.price=price;
        this.color = color;
        this.car = car;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "price", nullable = false, length = 45)
    private BigDecimal price;

    @Column(name = "color", nullable = false, length = 45)
    private String color;


    @JsonIgnoreProperties("details")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "car_id", nullable = false)
    private CarEntity car;


}
