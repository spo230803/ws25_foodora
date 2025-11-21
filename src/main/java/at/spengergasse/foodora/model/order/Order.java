package at.spengergasse.foodora.model.order;

import at.spengergasse.foodora.model.BaseEntity;
import at.spengergasse.foodora.model.Enum.OrderStatus;
import at.spengergasse.foodora.model.delivery.Delivery;
import at.spengergasse.foodora.model.resturant.Restaurant;
import at.spengergasse.foodora.model.user.Customer;
import at.spengergasse.foodora.model.valueObject.Address;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString(callSuper = true)
@Entity
@Table(name = "orders") // Evita parola riservata
public class Order extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private OrderStatus status;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FK_customer")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FK_restaurant")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems = new ArrayList<>();

    @Embedded
    private Address address;

    // JPA
    public Order() {}

    public void addOrderItem(OrderItem orderItem) {
        if (orderItem == null) return;
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    public void removeOrderItem(OrderItem orderItem) {
        if (orderItem == null) return;
        orderItems.remove(orderItem);
        orderItem.setOrder(null);
    }
}//end Order
