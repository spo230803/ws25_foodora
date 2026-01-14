package at.spengergasse.foodora.Respsoty;

import at.spengergasse.foodora.model.order.Order;
import at.spengergasse.foodora.prestistnce.OrderRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.util.Assert;

import java.util.Optional;

@DataJpaTest
public class OrderResptest
{
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void Order_ShutFindInove(){
        //------------Given
        //Create Test Elemneti (Ovvero delle classi da salvare nel DB da testare
        //OrderFixtzre.ofDegau()
        //orderRepository.save(...);

        entityManager.clear(); // Cancello cahce e forzo le query nel DB

        //Wenn
        Optional<Order> order = orderRepository.findByInvoceNumber("123");

        //Then
        //Assert.isTrue(order.isPresent());
    }
}
