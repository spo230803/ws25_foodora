package at.spengergasse.foodora.model.richtType;

import at.spengergasse.foodora.validation.StringGuard;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Email
{
    private String email;

    public Email(String email)
    {
        try {
            email = StringGuard.stringMinMax(email, 10, 100, "Email nicht Gultig!");
            this.email = email;
        }catch (Throwable e){
            throw e;
        }
    }//end construttor
}//End Class
