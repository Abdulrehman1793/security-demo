package com.abdulrehman1793.mma.repository;

import com.abdulrehman1793.mma.model.WorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkOrderRepository extends JpaRepository<WorkOrder, Integer> {
}