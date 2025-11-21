package at.spengergasse.foodora.model.resturant;

import at.spengergasse.foodora.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Owner extends BaseEntity
{
    @OneToOne
    private Restaurant restaurant;
}
