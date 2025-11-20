// Oggeto pconenente un gruppo di Colonne

package at.spengergasse.foodora.model.valueObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Address
{
    private String street;
    private String city;
    private String postalCode;
}//end Address
