package ir.rabbit.group.onlinestore.model.security;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@Table
@SequenceGenerator(
        name = "SEQ_USER",
        sequenceName = "SEQ_USER",
        allocationSize = 1
)
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable  {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER")
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private String phone;
    private String mobileNumber;
    private LocalDate birthDate;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date modifiedDate;


    public User(String fullName, String lastName, String email, String userName, String password, LocalDate birthDate, Date createdDate, Date modifiedDate)  {
        this.name = fullName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.birthDate = birthDate;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public User()  {

    }

    public Long getId()  {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public User id(Long id)  {
        this.id = id;
        return this;
    }

    public String getName()  {
        return name;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public User name(String fullName)  {
        this.name = fullName;
        return this;
    }

    public String getLastName()  {
        return lastName;
    }

    public void setLastName(String lastName)  {
        this.lastName = lastName;
    }

    public User lastName(String lastName)  {
        this.lastName = lastName;
        return this;
    }

    public String getEmail()  {
        return email;
    }

    public void setEmail(String email)  {
        this.email = email;
    }

    public User email(String email)  {
        this.email = email;
        return this;
    }

    public String getUserName()  {
        return userName;
    }

    public void setUserName(String userName)  {
        this.userName = userName;
    }

    public User userName(String userName)  {
        this.userName = userName;
        return this;
    }

    public String getPassword()  {
        return password;
    }

    public void setPassword(String password)  {
        this.password = password;
    }

    public User password(String password)  {
        this.password = password;
        return this;
    }

    public LocalDate getBirthDate()  {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate)  {
        this.birthDate = birthDate;
    }

    public User birthDate(LocalDate birthDate)  {
        this.birthDate = birthDate;
        return this;
    }

    public Date getCreatedDate()  {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate)  {
        this.createdDate = createdDate;
    }

    public User createdDate(Date createdDate)  {
        this.createdDate = createdDate;
        return this;
    }

    public Date getModifiedDate()  {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate)  {
        this.modifiedDate = modifiedDate;
    }

    public User modifiedDate(Date modifiedDate)  {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User phone(String phone)  {
        this.phone = phone;
        return this;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public User mobileNumber(String mobileNumber)  {
        this.mobileNumber = mobileNumber;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(password, user.password) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(mobileNumber, user.mobileNumber) &&
                Objects.equals(birthDate, user.birthDate) &&
                Objects.equals(createdDate, user.createdDate) &&
                Objects.equals(modifiedDate, user.modifiedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, lastName, email, userName, password, phone, mobileNumber, birthDate, createdDate, modifiedDate);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", birthDate=" + birthDate +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
