package com.abdulrehman1793.mma.repository;

import com.abdulrehman1793.mma.model.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, Integer> {
}