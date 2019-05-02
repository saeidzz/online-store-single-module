package ir.rabbit.group.onlinestore.model.product;


import ir.rabbit.group.onlinestore.model.customer.Comment;
import ir.rabbit.group.onlinestore.model.shopping.Order;
import ir.rabbit.group.onlinestore.model.shopping.ShoppingCartHasProduct;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A Product.
 */
@Entity
@Table(name = "product")
public class Product implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column
    private String name;
    @Column
    private String manufacturer;

    @OneToMany
    private List<WishListHasProduct> wishListHasProducts;

    @OneToMany
    private List<ShoppingCartHasProduct> shoppingCartHasProducts;

    @OneToMany
    private List<CategoryHasProduct> categoryHasProduct;

    @OneToMany
    private List<Order> orders;

    @OneToMany
    private List<Comment> comments;

    @OneToMany
    List<ProductMap> features;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public List<WishListHasProduct> getWishListHasProducts()  {
        return wishListHasProducts;
    }

    public Product wishListHasProducts(List<WishListHasProduct> wishListHasProducts)  {
        this.wishListHasProducts = wishListHasProducts;
        return this;
    }

    public void setWishListHasProducts(List<WishListHasProduct> wishListHasProducts)  {
        this.wishListHasProducts = wishListHasProducts;
    }

    public List<ShoppingCartHasProduct> getShoppingCartHasProducts()  {
        return shoppingCartHasProducts;
    }

    public Product shoppingCartHasProducts(List<ShoppingCartHasProduct> shoppingCartHasProducts)  {
        this.shoppingCartHasProducts = shoppingCartHasProducts;
        return this;
    }

    public void setShoppingCartHasProducts(List<ShoppingCartHasProduct> shoppingCartHasProducts)  {
        this.shoppingCartHasProducts = shoppingCartHasProducts;
    }

    public List<CategoryHasProduct> getCategoryHasProduct()  {
        return categoryHasProduct;
    }

    public Product categoryHasProduct(List<CategoryHasProduct> categoryHasProduct)  {
        this.categoryHasProduct = categoryHasProduct;
        return this;
    }

    public void setCategoryHasProduct(List<CategoryHasProduct> categoryHasProduct)  {
        this.categoryHasProduct = categoryHasProduct;
    }

    public List<Order> getOrders()  {
        return orders;
    }

    public Product orders(List<Order> orders)  {
        this.orders = orders;
        return this;
    }

    public void setOrders(List<Order> orders)  {
        this.orders = orders;
    }


    public String getName()  {
        return name;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public Product name(String name)  {
        this.name = name;
        return this;
    }



    public String getManufacturer()  {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)  {
        this.manufacturer = manufacturer;
    }


    public Product manufacturer(String manufacturer)  {
        this.manufacturer = manufacturer;
        return this;
    }

    public List<Comment> getComments()  {
        return comments;
    }

    public void setComments(List<Comment> comments)  {
        this.comments = comments;
    }


    public Product comments(List<Comment> comments)  {
        this.comments = comments;
        return this;
    }

    public List<ProductMap> getFetures()  {
        return features;
    }

    public void setFetures(List<ProductMap> features)  {
        this.features = features;
    }


    public Product features(List<ProductMap> features)  {
        this.features = features;
        return this;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        Product product = (Product) o;
        if (product.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "Product {" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                '}';
    }
}
