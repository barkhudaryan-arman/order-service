package ru.arman.orderservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.arman.orderservice.dto.CreateOrderRequest;
import ru.arman.orderservice.model.Order;
import ru.arman.orderservice.model.OrderStatus;
import ru.arman.orderservice.repository.OrderRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final OrderRepository orderRepository;

    @Transactional
    public Order createOrder(CreateOrderRequest request){
        Order order = Order.builder()
                .userId(request.getUserId())
                .amount(request.getAmount())
                .status(OrderStatus.PENDING)
                .build();

        Order savedOrder = orderRepository.save(order);

        log.info("Order created with id: {} for userId: {}",
                savedOrder.getId(), savedOrder.getUserId());

        return savedOrder;
    }
}
