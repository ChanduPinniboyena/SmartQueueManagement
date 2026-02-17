package com.example.SmartQueue.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceCounterResponse {
    private Long id;
    private String name;
    private String serviceCenterName;
    private String assignedStaffName;
    private String status;
    private int waitingCount;
}
