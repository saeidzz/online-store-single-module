package ir.rabbit.group.onlinestore.model.shopping;


import ir.rabbit.group.onlinestore.model.customer.Customer;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Payment.
 */
@Entity
@Table(name = "payment")
public class Payment implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @OneToOne
    private Customer customer;

    @Column(name = "order")
    private Order order;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "success")
    private Boolean success;

    @Column()
    private PaymentType type;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public Customer getCustomer()  {
        return customer;
    }

    public Payment customer(Customer customer)  {
        this.customer = customer;
        return this;
    }

    public void setCustomer(Customer customer)  {
        this.customer = customer;
    }

    public Order getOrder()  {
        return order;
    }

    public Payment order(Order order)  {
        this.order = order;
        return this;
    }

    public void setOrder(Order order)  {
        this.order = order;
    }

    public Long getAmount()  {
        return amount;
    }

    public Payment amount(Long amount)  {
        this.amount = amount;
        return this;
    }

    public void setAmount(Long amount)  {
        this.amount = amount;
    }

    public Boolean isSuccess()  {
        return success;
    }

    public Payment success(Boolean success)  {
        this.success = success;
        return this;
    }

    public void setSuccess(Boolean success)  {
        this.success = success;
    }

    public PaymentType getType()  {
        return type;
    }

    public Payment type(PaymentType type)  {
        this.type = type;
        return this;
    }

    public void setType(PaymentType type)  {
        this.type = type;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        Payment payment = (Payment) o;
        if (payment.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), payment.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "Payment {" +
            "id=" + getId() +
            ", customer='" + getCustomer() + "'" +
            ", order='" + getOrder() + "'" +
            ", amount=" + getAmount() +
            ", success='" + isSuccess() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }
}
