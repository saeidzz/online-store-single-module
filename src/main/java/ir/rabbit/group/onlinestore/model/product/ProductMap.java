package ir.rabbit.group.onlinestore.model.product;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class ProductMap implements Serializable  {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;
    @Column
    private String feature;
    @Column
    private String value;
    @Column
    private String quantity;


    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public ProductMap id(Long id)  {
        this.id = id;
        return this;
    }

    public String getFeature()  {
        return feature;
    }

    public void setFeature(String feature)  {
        this.feature = feature;
    }

    public ProductMap feature(String feature)  {
        this.feature = feature;
        return this;
    }

    public String getValue()  {
        return value;
    }

    public void setValue(String value)  {
        this.value = value;
    }

    public ProductMap value(String value)  {
        this.value = value;
        return this;
    }

    public String getQuantity()  {
        return quantity;
    }

    public void setQuantity(String quantity)  {
        this.quantity = quantity;
    }
    public ProductMap quantity(String quantity)  {
        this.quantity = quantity;
        return this;
    }
}
