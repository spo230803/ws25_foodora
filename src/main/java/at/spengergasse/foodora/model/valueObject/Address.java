// Oggeto pconenente un gruppo di Colonne

package at.spengergasse.foodora.model.valueObject;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Address {

    private final String street;
    private final String city;
    private final String postalCode;

    protected Address() { // per JPA
        this.street = null;
        this.city = null;
        this.postalCode = null;
    }
}//end Address
