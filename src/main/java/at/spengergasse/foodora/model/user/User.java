package at.spengergasse.foodora.model.user;

import at.spengergasse.foodora.model.BaseEntity;
import at.spengergasse.foodora.model.richtType.Email;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString(callSuper = true)
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "user_type",
        discriminatorType = DiscriminatorType.STRING
)
public abstract class User extends BaseEntity {

    @Column(name = "full_name")
    private String fullName;

    @Embedded
    private Email email;

}//end user
