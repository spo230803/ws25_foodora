package at.spengergasse.foodora.model.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "payment_method")
public abstract class PaymentMethod extends User
{
    @Column(name = "alias", nullable = false, length = 100)
    private String alias;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_customer")
    private Customer customer;

    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}//end PayamentMethod
