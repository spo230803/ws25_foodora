package at.spengergasse.foodora.model.user;

import at.spengergasse.foodora.model.richtType.Email;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@Entity
@DiscriminatorValue("PP")
public class PayPal extends PaymentMethod
{
    @Embedded
    private Email email;
}//end PayPal
