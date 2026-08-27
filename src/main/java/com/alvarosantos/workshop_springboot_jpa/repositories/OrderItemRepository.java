package com.alvarosantos.workshop_springboot_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvarosantos.workshop_springboot_jpa.entities.OrderItem;
import com.alvarosantos.workshop_springboot_jpa.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
