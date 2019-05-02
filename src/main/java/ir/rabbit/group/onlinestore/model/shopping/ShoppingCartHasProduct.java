package ir.rabbit.group.onlinestore.model.shopping;


import ir.rabbit.group.onlinestore.model.product.Product;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A ShoppingCartHasProduct.
 */
@Entity
@Table(name = "shopping_cart_has_product")
public class ShoppingCartHasProduct implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @OneToOne
    private ShoppingCart shoppingCart;

    @OneToOne
    private Product product;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public ShoppingCart getShoppingCart()  {
        return shoppingCart;
    }

    public ShoppingCartHasProduct shoppingCart(ShoppingCart shoppingCart)  {
        this.shoppingCart = shoppingCart;
        return this;
    }

    public void setShoppingCart(ShoppingCart shoppingCart)  {
        this.shoppingCart = shoppingCart;
    }

    public Product getProduct()  {
        return product;
    }

    public ShoppingCartHasProduct product(Product product)  {
        this.product = product;
        return this;
    }

    public void setProduct(Product product)  {
        this.product = product;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        ShoppingCartHasProduct shoppingCartHasProduct = (ShoppingCartHasProduct) o;
        if (shoppingCartHasProduct.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), shoppingCartHasProduct.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "ShoppingCartHasProduct {" +
            "id=" + getId() +
            ", shoppingCart='" + getShoppingCart() + "'" +
            ", product='" + getProduct() + "'" +
            "}";
    }
}
