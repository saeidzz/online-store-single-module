package ir.rabbit.group.onlinestore.model.product;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A Category.
 */
@Entity
@Table(name = "category")
public class Category implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany
    private List<Category> subCategories;

    @OneToMany
    private List<CategoryHasProduct> categoryHasProducts;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public String getName()  {
        return name;
    }

    public Category name(String name)  {
        this.name = name;
        return this;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public List<Category> getSubCategories()  {
        return subCategories;
    }

    public Category subCategories(List<Category> subCategories)  {
        this.subCategories = subCategories;
        return this;
    }

    public void setSubCategories(List<Category> subCategories)  {
        this.subCategories = subCategories;
    }

    public List<CategoryHasProduct> getCategoryHasProducts()  {
        return categoryHasProducts;
    }

    public Category categoryHasProducts(List<CategoryHasProduct> categoryHasProducts)  {
        this.categoryHasProducts = categoryHasProducts;
        return this;
    }

    public void setCategoryHasProducts(List<CategoryHasProduct> categoryHasProducts)  {
        this.categoryHasProducts = categoryHasProducts;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        Category category = (Category) o;
        if (category.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), category.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "Category {" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", subCategories='" + getSubCategories() + "'" +
            ", categoryHasProducts='" + getCategoryHasProducts() + "'" +
            "}";
    }
}
