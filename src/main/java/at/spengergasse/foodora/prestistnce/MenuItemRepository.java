package at.spengergasse.foodora.prestistnce;

import at.spengergasse.foodora.model.resturant.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
