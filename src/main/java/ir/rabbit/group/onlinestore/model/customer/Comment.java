package ir.rabbit.group.onlinestore.model.customer;


import ir.rabbit.group.onlinestore.model.product.Product;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Comment.
 */
@Entity
@Table(name = "comment")
public class Comment implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Product product;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public Customer getCustomer()  {
        return customer;
    }

    public Comment customer(Customer customer)  {
        this.customer = customer;
        return this;
    }

    public void setCustomer(Customer customer)  {
        this.customer = customer;
    }

    public Product getProduct()  {
        return product;
    }

    public Comment product(Product product)  {
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
        Comment comment = (Comment) o;
        if (comment.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), comment.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "Comment {" +
            "id=" + getId() +
            ", customer='" + getCustomer() + "'" +
            ", product='" + getProduct() + "'" +
            "}";
    }
}
