package com.example.SmartQueue.repository;

import java.util.List;
import com.example.SmartQueue.model.ServiceCounter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCounterRepository extends JpaRepository<ServiceCounter, Long> {
    List<ServiceCounter> findByServiceCenterId(Long serviceCenterId);
}
