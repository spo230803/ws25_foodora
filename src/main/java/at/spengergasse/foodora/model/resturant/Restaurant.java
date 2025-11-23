package at.spengergasse.foodora.model.resturant;

import at.spengergasse.foodora.model.BaseEntity;
import at.spengergasse.foodora.model.Enum.CusineType;
import at.spengergasse.foodora.model.valueObject.Address;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@ToString(callSuper=true)
@Entity
@Table(name = "resturant")
@Setter
public class Restaurant extends BaseEntity
{
    @Column(name = "name", nullable = false,length = 100)
    @NotBlank(message = "Name kann nicht Lehere sein")
    @Size(min = 5, max = 100)
    private String name;

    @Column(name = "cusineType", nullable = false)
    @Enumerated(EnumType.STRING)
    private CusineType cusineType;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY )
   /* @JoinTable(
            name = "menu_item",
            joinColumns = @JoinColumn(name = "restuarant_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_item_id")
    )*/
    private List<MenuItem> menuItems = new ArrayList<>();

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
