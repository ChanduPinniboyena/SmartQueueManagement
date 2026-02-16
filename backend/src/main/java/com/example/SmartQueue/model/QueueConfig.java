package com.example.SmartQueue.model;

import java.time.LocalTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "queue_configs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueueConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "service_counter_id", nullable = false, unique = true)
    private ServiceCounter serviceCounter;

    private Integer maxTokensPerDay;

    private Integer avgServiceTimeMinutes;

    private LocalTime autoCloseTime;
}
