package at.spengergasse.foodora.model.order;

import at.spengergasse.foodora.model.BaseEntity;
import at.spengergasse.foodora.model.Enum.OrderStatus;
import at.spengergasse.foodora.model.delivery.Delivery;
import at.spengergasse.foodora.model.resturant.Restuarant;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;
import org.apache.tomcat.jni.SSLConf;

import java.util.List;

@Getter
@ToString(callSuper=true)
@Entity
@Table(name = "ORDER")
public class Order extends BaseEntity
{

    @Column(name = "status", nullable = false)
    private OrderStatus status;

    //TODO: Costrumer


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_delivery")
    public Delivery  delivery;


    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_resturnat")
    private Restuarant restuarant;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;


    //JPA
    public Order() {}

    public void addOrderItem(OrderItem orderItem)
    {
        if(this.orderItems == null) return;
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    public  void removeOrderItem(OrderItem orderItem)
    {
        if(this.orderItems == null) return;
        orderItems.remove(orderItem);
        orderItem.setOrder(null);
    }
}//end Order
