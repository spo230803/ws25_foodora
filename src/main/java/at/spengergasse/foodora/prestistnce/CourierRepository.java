package at.spengergasse.foodora.prestistnce;

import at.spengergasse.foodora.model.delivery.Courier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourierRepository extends CrudRepository<Courier, Long> {
}
