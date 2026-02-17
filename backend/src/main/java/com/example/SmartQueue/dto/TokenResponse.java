package com.example.SmartQueue.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenResponse {
    private Long id;
    private String tokenNumber;
    private String serviceCenterName;
    private String serviceCounterName;
    private String status;
    private String priority;
    private int position;
    private int estimatedWaitTime;
    private String issuedAt;
}
