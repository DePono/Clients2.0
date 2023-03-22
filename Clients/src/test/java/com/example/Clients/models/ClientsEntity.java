package com.example.Clients.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "clients", schema = "public", catalog = "postgres")
public class ClientsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_company", nullable = false, length = -1)
    private int idCompany;
    @Basic
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Basic
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;
    @Basic
    @Column(name = "email_user", nullable = false, length = 50)
    private String emailUser;
    @Basic
    @Column(name = "phone_number", nullable = false, length = 50)
    private String phoneNumber;
    @OneToMany(mappedBy = "clientsByIdClient")
    private Collection<SystemsEntity> systemsById;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "phone", nullable = false, length = -1)
    private String phone;
    @Basic
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "phone", nullable = false)
    private CompaniesEntity companiesByIdCompany;
    @OneToMany(mappedBy = "clientsByIdClient")
    private Collection<CyctemsEntity> cyctemsByPhone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(String idCompany) {
        this.idCompany = idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientsEntity that = (ClientsEntity) o;
        return id == that.id && idCompany == that.idCompany && Objects.equals(username, that.username) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(emailUser, that.emailUser) && Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idCompany, username, firstName, lastName, emailUser, phoneNumber);
    }

    public Collection<SystemsEntity> getSystemsById() {
        return systemsById;
    }

    public void setSystemsById(Collection<SystemsEntity> systemsById) {
        this.systemsById = systemsById;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CompaniesEntity getCompaniesByIdCompany() {
        return companiesByIdCompany;
    }

    public void setCompaniesByIdCompany(CompaniesEntity companiesByIdCompany) {
        this.companiesByIdCompany = companiesByIdCompany;
    }

    public Collection<CyctemsEntity> getCyctemsByPhone() {
        return cyctemsByPhone;
    }

    public void setCyctemsByPhone(Collection<CyctemsEntity> cyctemsByPhone) {
        this.cyctemsByPhone = cyctemsByPhone;
    }
}
