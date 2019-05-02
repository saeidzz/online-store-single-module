package ir.rabbit.group.onlinestore.model.shopping;


import ir.rabbit.group.onlinestore.model.customer.Customer;
import ir.rabbit.group.onlinestore.model.product.Product;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A Order.
 */
@Entity
@Table(name = "order")
public class Order implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @OneToOne
    private Customer customer;

    @OneToMany
    private List<Product> products;

    @OneToOne
    private Payment payment;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public Customer getCustomer()  {
        return customer;
    }

    public Order customer(Customer customer)  {
        this.customer = customer;
        return this;
    }

    public void setCustomer(Customer customer)  {
        this.customer = customer;
    }

    public List<Product> getProducts()  {
        return products;
    }

    public Order products(List<Product> products)  {
        this.products = products;
        return this;
    }

    public void setProducts(List<Product> products)  {
        this.products = products;
    }

    public Payment getPayment()  {
        return payment;
    }

    public Order payment(Payment payment)  {
        this.payment = payment;
        return this;
    }

    public void setPayment(Payment payment)  {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        Order order = (Order) o;
        if (order.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), order.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "Order {" +
            "id=" + getId() +
            ", customer='" + getCustomer() + "'" +
            ", products='" + getProducts() + "'" +
            ", payment='" + getPayment() + "'" +
            "}";
    }
}
