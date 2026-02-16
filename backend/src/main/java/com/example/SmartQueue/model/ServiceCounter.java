package com.example.SmartQueue.model;

import com.example.SmartQueue.enums.CounterStatus;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "service_counters", uniqueConstraints = @UniqueConstraint(columnNames = { "name", "service_center_id" }))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceCounter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "service_center_id", nullable = false)
    private ServiceCenter serviceCenter;

    @ManyToOne
    @JoinColumn(name = "assigned_staff_id")
    private User assignedStaff;

    @Enumerated(EnumType.STRING)
    private CounterStatus status;
}
