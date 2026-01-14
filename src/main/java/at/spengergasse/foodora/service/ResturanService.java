package at.spengergasse.foodora.service;

import at.spengergasse.foodora.model.resturant.Restaurant;
import at.spengergasse.foodora.prestistnce.RestaurantRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional  // <- CLASS LEVEL: Default for all methods
public class ResturanService
{
    @Autowired
    private final RestaurantRepository restaurantRepository;

    public List<Restaurant> getRestaurantByName(String name)
    {
        return restaurantRepository.findByName(name);
    }

    @Transactional
    public void  addRestaurant(Restaurant restaurant)
    {
        restaurantRepository.save(restaurant);
    }

    @Transactional
    public void updateRestaurant(Restaurant restaurant)
    {
        restaurantRepository.save(restaurant);
    }


}//end class
