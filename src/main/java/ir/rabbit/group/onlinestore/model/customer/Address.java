package ir.rabbit.group.onlinestore.model.customer;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Address.
 */
@Entity
@Table(name = "address")
public class Address implements Serializable  {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "address_type")
    private AddressType addressType;

    @ManyToOne
    private City city;

    @Column(name = "plain_address")
    private String plainAddress;

    @Column(name = "postal_code")
    private String postalCode;

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public AddressType getAddressType()  {
        return addressType;
    }

    public Address addressType(AddressType addressType)  {
        this.addressType = addressType;
        return this;
    }

    public void setAddressType(AddressType addressType)  {
        this.addressType = addressType;
    }

    public City getCity()  {
        return city;
    }

    public Address city(City city)  {
        this.city = city;
        return this;
    }

    public void setCity(City city)  {
        this.city = city;
    }

    public String getPlainAddress()  {
        return plainAddress;
    }

    public Address plainAddress(String plainAddress)  {
        this.plainAddress = plainAddress;
        return this;
    }

    public void setPlainAddress(String plainAddress)  {
        this.plainAddress = plainAddress;
    }

    public String getPostalCode()  {
        return postalCode;
    }

    public Address postalCode(String postalCode)  {
        this.postalCode = postalCode;
        return this;
    }

    public void setPostalCode(String postalCode)  {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o)  {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass())  {
            return false;
        }
        Address address = (Address) o;
        if (address.getId() == null || getId() == null)  {
            return false;
        }
        return Objects.equals(getId(), address.getId());
    }

    @Override
    public int hashCode()  {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()  {
        return "Address {" +
            "id=" + getId() +
            ", addressType='" + getAddressType() + "'" +
            ", city='" + getCity() + "'" +
            ", plainAddress='" + getPlainAddress() + "'" +
            ", postalCode='" + getPostalCode() + "'" +
            "}";
    }
}
