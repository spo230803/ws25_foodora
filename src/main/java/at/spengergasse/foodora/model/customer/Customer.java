package at.spengergasse.foodora.model.customer;

import at.spengergasse.foodora.model.resturant.Restuarant;
import at.spengergasse.foodora.model.richtType.Phone;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Embedded;

@DiscriminatorValue("0")
public class Customer  extends User
{
    @Embedded
    @Column(name = "phone")
    private Phone phone;

    //TODO: Metodi pagamento
}//Customer
