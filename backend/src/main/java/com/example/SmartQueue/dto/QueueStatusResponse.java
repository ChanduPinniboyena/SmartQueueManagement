package com.example.SmartQueue.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueueStatusResponse {
    private Long tokenId;
    private String tokenNumber;
    private int position;
    private int estimatedWaitMinutes;
    private String status;
    private int totalInQueue;
}
