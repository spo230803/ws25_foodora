package at.spengergasse.foodora.prestistnce;

import at.spengergasse.foodora.model.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository  extends JpaRepository<Order,Long>
{
    public List<Order> findOrderByStatus(String status);
}
