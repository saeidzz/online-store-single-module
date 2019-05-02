package ir.rabbit.group.onlinestore.model.product;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A CategoryHasProduct.
 */
@Entity
@Table(name = "category_has_product")
public class CategoryHasProduct implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @OneToOne
    private Product product;

    @OneToOne
    private Category category;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public Product getProduct()  {
        return product;
    }

    public CategoryHasProduct product(Product product)  {
        this.product = product;
        return this;
    }

    public void setProduct(Product product)  {
        this.product = product;
    }

    public Category getCategory()  {
        return category;
    }

    public CategoryHasProduct category(Category category)  {
        this.category = category;
        return this;
    }

    public void setCategory(Category category)  {
        this.category = category;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        CategoryHasProduct categoryHasProduct = (CategoryHasProduct) o;
        if (categoryHasProduct.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), categoryHasProduct.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "CategoryHasProduct {" +
            "id=" + getId() +
            ", product='" + getProduct() + "'" +
            ", category='" + getCategory() + "'" +
            "}";
    }
}
