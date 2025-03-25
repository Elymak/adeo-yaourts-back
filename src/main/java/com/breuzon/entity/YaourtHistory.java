package com.breuzon.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "yaourt_history")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class YaourtHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int userId;

    private int quantity;

    private LocalDateTime datetime;
}