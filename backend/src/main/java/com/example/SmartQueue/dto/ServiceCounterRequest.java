package com.example.SmartQueue.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceCounterRequest {
    private String name;
    private Long serviceCenterId;
    private Long assignedStaffId;
}
