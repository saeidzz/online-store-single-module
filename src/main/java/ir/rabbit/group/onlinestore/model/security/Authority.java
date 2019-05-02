package ir.rabbit.group.onlinestore.model.security;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Authority.
 */
@Entity
@Table(name = "authority")
public class Authority implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @OneToOne
    private Role role;

    @Column(name = "name")
    private String name;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public Role getRole()  {
        return role;
    }

    public Authority role(Role role)  {
        this.role = role;
        return this;
    }

    public void setRole(Role role)  {
        this.role = role;
    }

    public String getName()  {
        return name;
    }

    public Authority name(String name)  {
        this.name = name;
        return this;
    }

    public void setName(String name)  {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        Authority authority = (Authority) o;
        if (authority.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), authority.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "Authority {" +
            "id=" + getId() +
            ", role='" + getRole() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
}
