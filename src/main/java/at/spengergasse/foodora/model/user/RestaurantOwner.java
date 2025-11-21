package at.spengergasse.foodora.model.user;

import at.spengergasse.foodora.model.resturant.Restaurant;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@Entity
@DiscriminatorValue("RESTAURANT_OWNER")
public class RestaurantOwner extends User {

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_restaurant")
    private Restaurant restaurant;
}//RestaurantOwner