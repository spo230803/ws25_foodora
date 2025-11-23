package at.spengergasse.foodora.prestistnce;

import at.spengergasse.foodora.model.resturant.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
