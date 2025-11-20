package at.spengergasse.foodora.model.richtType;

import at.spengergasse.foodora.validation.StringGuard;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Embeddable
public class Phone
{
    private String value;

    public  Phone(String value)
    {
        try {
            value = StringGuard.stringMinMax(value,0,50,null);
            this.value = value;
        }catch (Throwable e){
            throw e;
        }

    }
}//end Phone
