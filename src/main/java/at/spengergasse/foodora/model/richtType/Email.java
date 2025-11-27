package at.spengergasse.foodora.model.richtType;

import at.spengergasse.foodora.validation.StringGuard;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Email
{
    @Column(name = "email_value")
    private String email;

    protected Email(){}

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
