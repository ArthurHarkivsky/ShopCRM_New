package ua.crm.DB;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Oleg on 07.09.2016.
 */
public interface OrderStatusDao extends JpaRepository<OrderStatus, Integer> {
}
