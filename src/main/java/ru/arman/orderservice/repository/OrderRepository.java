package ru.arman.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arman.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
