package at.spengergasse.foodora.model.delivery;

import at.spengergasse.foodora.model.BaseEntity;
import at.spengergasse.foodora.model.Enum.VeihicleType;
import at.spengergasse.foodora.model.richtType.Phone;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString(callSuper=true)
@Entity
@Table(name = "Courier")
public class Courier extends BaseEntity
{
    @Column(name = "name", nullable = false, length = 50)
    @Size(min = 3, max = 50)
    private String name;

/*
    @Column(name = "phone", nullable = false, length = 50)
    @Embedded
    private Phone phone;
*/

   // @Column(name = "veihicleType", nullable = true, length = 50)
   // @Convert(converter =  VeihicleType.class)
    @Enumerated(EnumType.STRING)
    private VeihicleType veihicleType;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,mappedBy = "courier")
    private List<Delivery> deliveries = new ArrayList<>();

    //JPA
    
    protected  Courier()    {}


}//Courier