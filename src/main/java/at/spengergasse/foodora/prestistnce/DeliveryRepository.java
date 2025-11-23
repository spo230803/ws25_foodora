package at.spengergasse.foodora.prestistnce;

import at.spengergasse.foodora.model.delivery.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeliveryRepository extends JpaRepository<Delivery,Long> {
}
