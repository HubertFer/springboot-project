package com.hfs.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hfs.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
