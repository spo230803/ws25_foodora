package at.spengergasse.foodora.model.order;

import at.spengergasse.foodora.model.BaseEntity;
import at.spengergasse.foodora.model.resturant.MenuItem;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.ToString;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@ToString(callSuper=true)
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem extends BaseEntity
{

    @Column(name = "name", nullable = false,length = 100)
    @NotBlank(message = "Name kann nicht Lehere sein")
    @Size(min = 5, max = 100)
    private String name;

    @Column(name = "price", nullable = false)
    @Min(value = 0, message = "price muss > 0")
    private double price;

    @Column(name = "quantity", nullable = false)
    @Min(value = 1, message = "quantity muss > 1")
    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_Order")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_elemntMenu")
    private MenuItem menuItem;

    //JPA
    public OrderItem() {}

}//OrderItem
