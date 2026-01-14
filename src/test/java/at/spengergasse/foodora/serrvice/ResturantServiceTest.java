package at.spengergasse.foodora.serrvice;

import at.spengergasse.foodora.model.Enum.CusineType;
import at.spengergasse.foodora.model.resturant.MenuItem;
import at.spengergasse.foodora.model.resturant.Restaurant;
import at.spengergasse.foodora.model.valueObject.Address;
import at.spengergasse.foodora.service.ResturanService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Transactional
public class ResturantServiceTest
{
    @Autowired
    ResturanService resturanService;

    FactoryResturant fr =  new FactoryResturant();


    @Test
    public void testResturantService_AddResturant()
    {
        Restaurant restaurant = fr.createOkayRestaurant();
        restaurant.addMenuItem(fr.createOkayMenuItem());
        resturanService.addRestaurant(restaurant);


    }

    @Test
    public void testResturantService_FindResturantByName()
    {
        Restaurant restaurant = fr.createOkayRestaurant();
        restaurant.addMenuItem(fr.createOkayMenuItem());
        resturanService.addRestaurant(restaurant);

        List<Restaurant> listaResturant = resturanService.getRestaurantByName("SPG");
        
    }


}

class FactoryResturant
{
    public   Restaurant  createOkayRestaurant()
    {
        Address via = new Address("spgr","wien","123");
        Restaurant restaurant = new Restaurant("SPG", CusineType.ASIAN, via );
        return restaurant;
    }

    public MenuItem createOkayMenuItem()
    {
        return new MenuItem("Pizza_");
    }
}
