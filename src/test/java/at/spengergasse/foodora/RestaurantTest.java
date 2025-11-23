package at.spengergasse.foodora;

import at.spengergasse.foodora.model.*;
import at.spengergasse.foodora.model.Enum.CusineType;
import at.spengergasse.foodora.model.resturant.MenuItem;
import at.spengergasse.foodora.model.resturant.Owner;
import at.spengergasse.foodora.model.resturant.Restaurant;
import at.spengergasse.foodora.model.valueObject.Address;
import at.spengergasse.foodora.prestistnce.MenuItemRepository;
import at.spengergasse.foodora.prestistnce.RestaurantRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class RestaurantTest
{

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private MenuItemRepository menuItemRepository;

    @Test
    void testAddAndRemoveMenuItem() {
        // Creo un ristorante
        Address adds = new  Address("Via Roma",   "Rome","00100");
        Restaurant restaurant = new Restaurant("La Bella Italia",CusineType.ASIAN, adds );


        // Creo un MenuItem
        MenuItem pizza = new MenuItem("Pizza Margherita");

        // Aggiungo MenuItem al ristorante
        restaurant.addMenuItem(pizza);

        // Salvo il ristorante (cascade salva anche i MenuItem)
        restaurantRepository.save(restaurant);

        // Verifico che il MenuItem sia stato salvato
        Optional<Restaurant> foundRestaurant = restaurantRepository.findById(restaurant.getId());
        assertThat(foundRestaurant).isPresent();
        assertThat(foundRestaurant.get().getMenuItems().get(0).getName()).isEqualTo("Pizza Margherita");

        // Rimuovo MenuItem
        restaurant.removeMenuItem(pizza);
        restaurantRepository.save(restaurant);

        // Verifico che la lista sia vuota
        Optional<Restaurant> updatedRestaurant = restaurantRepository.findById(restaurant.getId());
        assertThat(updatedRestaurant).isPresent();


    }
}
