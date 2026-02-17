package com.example.SmartQueue.repository;

import java.util.List;
import com.example.SmartQueue.model.ServiceCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCenterRepository extends JpaRepository<ServiceCenter, Long> {
    List<ServiceCenter> findByName(String name);
}
