package at.spengergasse.foodora.model.resturant;


import at.spengergasse.foodora.model.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Entity
@Table(name = "menu_item")
@Setter
public class MenuItem extends BaseEntity {

    @Column(name = "name", nullable = false, length = 100)
    @NotBlank(message = "Name kann nicht leer sein")
    @Size(min = 3, max = 100)
    private String name;

    @Column(name = "description", length = 255)
    @Size(max = 255)
    private String description;

    @Column(name = "price", nullable = false)
    @Min(value = 0, message = "Price muss >= 0")
    private float price;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    //@JoinColumn(name = "fk_restaurant")
    private Restaurant restaurant;

    // JPA
    public MenuItem() {}

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}//end MenuItem