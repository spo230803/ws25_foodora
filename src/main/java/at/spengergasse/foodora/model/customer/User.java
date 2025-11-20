package at.spengergasse.foodora.model.customer;

import at.spengergasse.foodora.model.BaseEntity;
import at.spengergasse.foodora.model.richtType.Email;
import jakarta.persistence.*;

@Entity
@Table(name = "USER")
@DiscriminatorColumn(
        discriminatorType = DiscriminatorType.INTEGER,
        name = "isResturnat",
        columnDefinition = "TINYINT(1)"
)
public abstract class User extends BaseEntity
{

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Email")
    @Embedded
    private Email email;
}//end user
