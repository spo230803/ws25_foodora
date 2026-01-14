package at.spengergasse.foodora.prestistnce;

import at.spengergasse.foodora.model.Enum.OrderStatus;
import at.spengergasse.foodora.model.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository  extends JpaRepository<Order,Long>
{
    //List  -> null to N
    public List<Order> findAllByStatus(OrderStatus status);

    //Optina -> null oder NUR 1 Elemnt
    Optional<Order> findOrderById(Long id);

    Optional<Order> findByInvoceNumber(String invoceNumber); //
}
