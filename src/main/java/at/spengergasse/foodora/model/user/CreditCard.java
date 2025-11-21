package at.spengergasse.foodora.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@Entity
@DiscriminatorValue("CC")
public class CreditCard extends PaymentMethod
{
    @Column(name = "cc", length = 100, nullable = true)
    private String number;

    //JPA
    public CreditCard() {}
}//CreditCard