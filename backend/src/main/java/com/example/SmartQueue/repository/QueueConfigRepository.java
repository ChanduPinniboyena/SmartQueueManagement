package com.example.SmartQueue.repository;

import com.example.SmartQueue.model.QueueConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface QueueConfigRepository extends JpaRepository<QueueConfig, Long> {
    Optional<QueueConfig> findByServiceCounterId(Long serviceCounterId);
}