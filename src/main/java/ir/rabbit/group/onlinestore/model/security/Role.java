package ir.rabbit.group.onlinestore.model.security;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A Role.
 */
@Entity
@Table(name = "role")
public class Role implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    private User user;

    @OneToMany
    private List<Authority> authorities;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public String getName()  {
        return name;
    }

    public Role name(String name)  {
        this.name = name;
        return this;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public User getUser()  {
        return user;
    }

    public Role user(User user)  {
        this.user = user;
        return this;
    }

    public void setUser(User user)  {
        this.user = user;
    }

    public List<Authority> getAuthorities()  {
        return authorities;
    }

    public Role authorities(List<Authority> authorities)  {
        this.authorities = authorities;
        return this;
    }

    public void setAuthorities(List<Authority> authorities)  {
        this.authorities = authorities;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        Role role = (Role) o;
        if (role.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), role.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "Role {" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", user='" + getUser() + "'" +
            ", authorities='" + getAuthorities() + "'" +
            "}";
    }
}
