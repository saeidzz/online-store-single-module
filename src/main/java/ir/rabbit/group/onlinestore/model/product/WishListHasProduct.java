package ir.rabbit.group.onlinestore.model.product;


import ir.rabbit.group.onlinestore.model.shopping.WishList;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A WishListHasProduct.
 */
@Entity
@Table(name = "wish_list_has_product")
public class WishListHasProduct implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @OneToOne
    private WishList wishList;

    @OneToOne
    private Product product;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public WishList getWishList()  {
        return wishList;
    }

    public WishListHasProduct wishList(WishList wishList)  {
        this.wishList = wishList;
        return this;
    }

    public void setWishList(WishList wishList)  {
        this.wishList = wishList;
    }

    public Product getProduct()  {
        return product;
    }

    public WishListHasProduct product(Product product)  {
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
        WishListHasProduct wishListHasProduct = (WishListHasProduct) o;
        if (wishListHasProduct.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), wishListHasProduct.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "WishListHasProduct {" +
            "id=" + getId() +
            ", wishList='" + getWishList() + "'" +
            ", product='" + getProduct() + "'" +
            "}";
    }
}
