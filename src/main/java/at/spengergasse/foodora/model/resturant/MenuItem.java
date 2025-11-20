package at.spengergasse.foodora.model.resturant;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper=true)
@Entity
@Table(name = "menu_item")
public class MenuItem extends Owner
{

    @Column(name = "name", nullable = false,length = 100)
    @NotBlank(message = "Name kann nicht Lehere sein")
    @Size(min = 3, max = 100)
    private String name;

    @Column(name = "description", nullable = true,length = 255)
    @Size(max = 255)
    private String description;

    @Column(name = "price", nullable = false)
    @Min(value = 0, message = "Price muss > 0")
    private float price;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_resturnat")
    private Restuarant restuarant;

    public MenuItem() {}

    public void setRestuarant(Restuarant restuarant)
    {
        this.restuarant = restuarant;
    }
}//end Class
