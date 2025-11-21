package at.spengergasse.foodora.model.delivery;

import at.spengergasse.foodora.model.BaseEntity;
import at.spengergasse.foodora.model.Enum.VeihicleType;
import at.spengergasse.foodora.model.richtType.Phone;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper=true)
@Entity
@Table(name = "Courier")
public class Courier extends BaseEntity
{
    @Column(name = "name", nullable = false, length = 50)
    @Size(min = 3, max = 50)
    private String name;

    @Column(name = "phone", nullable = false, length = 50)
    @Embedded
    private Phone phone;

    @Column(name = "veihicleType", nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private VeihicleType veihicleType;

}//Courier