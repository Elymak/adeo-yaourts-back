package com.breuzon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_config")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "delivery_time", nullable = false)
    private int deliveryTime;

    @Column(name = "monday_consommation", nullable = false)
    private int mondayConsommation;

    @Column(name = "tuesday_consommation", nullable = false)
    private int tuesdayConsommation;

    @Column(name = "wednesday_consommation", nullable = false)
    private int wednesdayConsommation;

    @Column(name = "thursday_consommation", nullable = false)
    private int thursdayConsommation;

    @Column(name = "friday_consommation", nullable = false)
    private int fridayConsommation;

    @Column(name = "saturday_consommation", nullable = false)
    private int saturdayConsommation;

    @Column(name = "sunday_consommation", nullable = false)
    private int sundayConsommation;

    @Column(name = "yaourt_format", nullable = false)
    private int yaourtFormat;
}