package com.example.SmartQueue.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationResponse {
    private Long id;
    private String title;
    private String body;
    private String type;
    private boolean read;
    private LocalDateTime sentAt;
}
