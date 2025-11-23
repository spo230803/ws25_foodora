package at.spengergasse.foodora.model.resturant;

import at.spengergasse.foodora.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.*;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Owner extends BaseEntity
{
    @OneToOne
    private Restaurant restaurant;
}
