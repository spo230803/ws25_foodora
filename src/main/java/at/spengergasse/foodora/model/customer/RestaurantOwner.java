package at.spengergasse.foodora.model.customer;

import at.spengergasse.foodora.model.resturant.Restuarant;
import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("1")
public class RestaurantOwner extends User
{
    private Restuarant restuarant;
}//RestaurantOwner
