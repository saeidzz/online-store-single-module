package ir.rabbit.group.onlinestore.model.customer;


import ir.rabbit.group.onlinestore.model.security.User;
import ir.rabbit.group.onlinestore.model.shopping.Order;
import ir.rabbit.group.onlinestore.model.shopping.ShoppingCart;
import ir.rabbit.group.onlinestore.model.shopping.WishList;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A Customer.
 */
@Entity
@Table(name = "customer")
@PrimaryKeyJoinColumn(name="ID")
public class Customer extends User implements Serializable  {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;


    @OneToOne
    private WishList wishList;

    @OneToOne
    private ShoppingCart shoppingCart;

    @OneToMany
    private List<Order> orders;

    @OneToOne
    private Address shippingAddress;
    @OneToOne
    private Address address;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }


    public WishList getWishList()  {
        return wishList;
    }

    public Customer wishList(WishList wishList)  {
        this.wishList = wishList;
        return this;
    }

    public void setWishList(WishList wishList)  {
        this.wishList = wishList;
    }

    public ShoppingCart getShoppingCart()  {
        return shoppingCart;
    }

    public Customer shoppingCart(ShoppingCart shoppingCart)  {
        this.shoppingCart = shoppingCart;
        return this;
    }

    public void setShoppingCart(ShoppingCart shoppingCart)  {
        this.shoppingCart = shoppingCart;
    }

    public List<Order> getOrders()  {
        return orders;
    }

    public Customer orders(List<Order> orders)  {
        this.orders = orders;
        return this;
    }

    public void setOrders(List<Order> orders)  {
        this.orders = orders;
    }

    public Address getShipingAddress() {
        return shippingAddress;
    }

    public void setShipingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Customer shippingAddress(Address shippingAddress)  {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer address(Address address)  {
        this.address = address;
        return this;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) &&
                Objects.equals(wishList, customer.wishList) &&
                Objects.equals(shoppingCart, customer.shoppingCart) &&
                Objects.equals(orders, customer.orders) &&
                Objects.equals(shippingAddress, customer.shippingAddress) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, wishList, shoppingCart, orders, shippingAddress, address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", wishList=" + wishList +
                ", shoppingCart=" + shoppingCart +
                ", orders=" + orders +
                ", shippingAddress=" + shippingAddress +
                ", address=" + address +
                "} " + super.toString();
    }
}
