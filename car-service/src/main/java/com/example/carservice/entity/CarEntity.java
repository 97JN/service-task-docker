package com.example.carservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CarEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="brand" ,nullable = false, length = 45)
    private String brand;

    @Column(name = "model", nullable = false, length = 45)
    private String model;

    @JsonIgnoreProperties("car")
    @OneToMany(mappedBy = "car", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<DetailEntity> details;


}
