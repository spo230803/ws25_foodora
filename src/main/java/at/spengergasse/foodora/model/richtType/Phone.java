package at.spengergasse.foodora.model.richtType;

import at.spengergasse.foodora.validation.StringGuard;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@Getter
@ToString
@EqualsAndHashCode
@Embeddable
public class Phone {

    private final String value;

    protected Phone() {
        this.value = null; // per JPA
    }

    public Phone(String value) {
        this.value = StringGuard.stringMinMax(value, 0, 50, null);
    }
}//Phone
