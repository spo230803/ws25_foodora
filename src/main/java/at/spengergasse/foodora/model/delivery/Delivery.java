package at.spengergasse.foodora.model.delivery;

import at.spengergasse.foodora.model.BaseEntity;
import at.spengergasse.foodora.model.Enum.DeliberyStatus;
import at.spengergasse.foodora.model.order.Order;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper=true)
@Entity
@Table(name = "Delivery")
public class Delivery extends BaseEntity
{
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING) // Sage Type String
    private DeliberyStatus status;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "FK_order", nullable = false, unique = true)
    private Order order;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "FK_courier")
    private Courier courier;

}//end Delivery
