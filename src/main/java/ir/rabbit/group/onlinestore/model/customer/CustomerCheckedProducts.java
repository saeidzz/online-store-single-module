package ir.rabbit.group.onlinestore.model.customer;


import ir.rabbit.group.onlinestore.model.product.Product;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A CustomerCheckedProducts.
 */
@Entity
@Table(name = "customer_checked_products")
public class CustomerCheckedProducts implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @OneToOne
    private Customer customer;

    @OneToMany
    private List<Product> products;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public Customer getCustomer()  {
        return customer;
    }

    public CustomerCheckedProducts customer(Customer customer)  {
        this.customer = customer;
        return this;
    }

    public void setCustomer(Customer customer)  {
        this.customer = customer;
    }

    public List<Product> getProducts()  {
        return products;
    }

    public CustomerCheckedProducts products(List<Product> products)  {
        this.products = products;
        return this;
    }

    public void setProducts(List<Product> products)  {
        this.products = products;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        CustomerCheckedProducts customerCheckedProducts = (CustomerCheckedProducts) o;
        if (customerCheckedProducts.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), customerCheckedProducts.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "CustomerCheckedProducts {" +
            "id=" + getId() +
            ", customer='" + getCustomer() + "'" +
            ", products='" + getProducts() + "'" +
            "}";
    }
}
