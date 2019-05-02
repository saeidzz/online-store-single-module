package ir.rabbit.group.onlinestore.model.shopping;


import ir.rabbit.group.onlinestore.model.customer.Customer;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A ShoppingCart.
 */
@Entity
@Table(name = "shopping_cart")
public class  ShoppingCart implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @OneToMany
    private List<ShoppingCartHasProduct> shoppingCartHasProducts;

    @OneToOne
    private Customer customer;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public List<ShoppingCartHasProduct> getShoppingCartHasProducts()  {
        return shoppingCartHasProducts;
    }

    public ShoppingCart shoppingCartHasProducts(List<ShoppingCartHasProduct> shoppingCartHasProducts)  {
        this.shoppingCartHasProducts = shoppingCartHasProducts;
        return this;
    }

    public void setShoppingCartHasProducts(List<ShoppingCartHasProduct> shoppingCartHasProducts)  {
        this.shoppingCartHasProducts = shoppingCartHasProducts;
    }

    public Customer getCustomer()  {
        return customer;
    }

    public ShoppingCart customer(Customer customer)  {
        this.customer = customer;
        return this;
    }

    public void setCustomer(Customer customer)  {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        ShoppingCart shoppingCart = (ShoppingCart) o;
        if (shoppingCart.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), shoppingCart.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "ShoppingCart {" +
            "id=" + getId() +
            ", shoppingCartHasProducts='" + getShoppingCartHasProducts() + "'" +
            ", customer='" + getCustomer() + "'" +
            "}";
    }
}
