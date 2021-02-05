package com.example.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.couse.entities.OrderItem;
import com.example.couse.entities.pk.OrderItemPK;




public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {



}