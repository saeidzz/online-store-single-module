package ir.rabbit.group.onlinestore.model.customer;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A City.
 */
@Entity
@Table(name = "city")
public class City implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private State state;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public String getName()  {
        return name;
    }

    public City name(String name)  {
        this.name = name;
        return this;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public State getState()  {
        return state;
    }

    public City state(State state)  {
        this.state = state;
        return this;
    }

    public void setState(State state)  {
        this.state = state;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        City city = (City) o;
        if (city.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), city.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "City {" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", state='" + getState() + "'" +
            "}";
    }
}
