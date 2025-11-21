package at.spengergasse.foodora.model.user;

import at.spengergasse.foodora.model.richtType.Phone;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Getter
@ToString(callSuper = true)
@Entity
@DiscriminatorValue("CUSTOMER")
public class Customer extends User {

    @Embedded
    private Phone phone;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PaymentMethod> paymentMethods = new ArrayList<>();

    // JPA
    public Customer() {}

    public void addPaymentMethod(PaymentMethod paymentMethod) {
        if(paymentMethod == null) return;
        paymentMethods.add(paymentMethod);
        paymentMethod.setCustomer(this);
    }

    public void removePaymentMethod(PaymentMethod paymentMethod) {
        if(paymentMethods == null) return;
        paymentMethods.remove(paymentMethod);
        paymentMethod.setCustomer(null);
    }
}//Customer
