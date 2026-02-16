package com.example.SmartQueue.model;

import com.example.SmartQueue.enums.CenterType;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(
    name = "service_centers",
    uniqueConstraints = @UniqueConstraint(columnNames = {"name", "address"})
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CenterType type;

    private String address;

    private String operatingHours;
}
