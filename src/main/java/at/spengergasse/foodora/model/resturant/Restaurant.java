package at.spengergasse.foodora.model.resturant;

import at.spengergasse.foodora.model.Enum.CusineType;
import at.spengergasse.foodora.model.valueObject.Address;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@ToString(callSuper=true)
@Entity
@Table(name = "resturant")
public class Restaurant extends Owner
{
    @Column(name = "name", nullable = false,length = 100)
    @NotBlank(message = "Name kann nicht Lehere sein")
    @Size(min = 5, max = 100)
    private String name;

    @Column(name = "cusineType", nullable = false)
    @Enumerated(EnumType.STRING)
    private CusineType cusineType;

    @OneToMany(mappedBy = "restuarant", cascade = CascadeType.ALL, orphanRemoval = false )
    private Set<MenuItem> menuItems = new HashSet<>(); //Von prof. SLM

    @Embedded
    @Column(name = "address", nullable = false)
    private Address address;


    //JPA
    public Restaurant() {}

    public void addMenuItem(MenuItem menuItem)//Von prof. SLM
    {
        if(menuItem == null) return;

        menuItems.add(menuItem);
        menuItem.setRestaurant(this);
    }//addMenuItem

    public void removeMenuItem(MenuItem menuItem)//Von prof. SLM
    {
        if(menuItem == null) return;
        menuItems.remove(menuItem);
        menuItem.setRestaurant(null);
    }

}//end class
