package at.spengergasse.foodora.model.delivery;

import at.spengergasse.foodora.model.BaseEntity;
import at.spengergasse.foodora.model.Enum.DeliveryStatus;
import at.spengergasse.foodora.model.order.Order;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@Entity
@Table(name = "delivery")
public class Delivery extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private DeliveryStatus status;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_order", nullable = false, unique = true)
    private Order order;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_courier")
    private Courier courier;

}//end Delivery
