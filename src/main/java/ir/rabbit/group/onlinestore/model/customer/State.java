package ir.rabbit.group.onlinestore.model.customer;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A State.
 */
@Entity
@Table(name = "state")
public class State implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany
    private List<City> cities;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public String getName()  {
        return name;
    }

    public State name(String name)  {
        this.name = name;
        return this;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public List<City> getCities()  {
        return cities;
    }

    public State cities(List<City> cities)  {
        this.cities = cities;
        return this;
    }

    public void setCities(List<City> cities)  {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        State state = (State) o;
        if (state.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), state.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "State {" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", cities='" + getCities() + "'" +
            "}";
    }
}
