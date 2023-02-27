package com.example.Clients.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "client", schema = "public", catalog = "postgres")
public class ClientEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_client", nullable = false)
    private int idClient;
    @Basic
    @Column(name = "id_company_fk", nullable = false)
    private int idCompanyFk;
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
    @ManyToOne
    @JoinColumn(name = "id_company_fk", referencedColumnName = "id_company", nullable = false)
    private CompanyEntity companyByIdCompanyFk;
    @OneToMany(mappedBy = "clientByIdClientFk")
    private Collection<SystemStewartPlatformEntity> systemStewartPlatformsByIdClient;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdCompanyFk() {
        return idCompanyFk;
    }

    public void setIdCompanyFk(int idCompanyFk) {
        this.idCompanyFk = idCompanyFk;
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
        ClientEntity that = (ClientEntity) o;
        return idClient == that.idClient && idCompanyFk == that.idCompanyFk && Objects.equals(username, that.username) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(emailUser, that.emailUser) && Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, idCompanyFk, username, firstName, lastName, emailUser, phoneNumber);
    }

    public CompanyEntity getCompanyByIdCompanyFk() {
        return companyByIdCompanyFk;
    }

    public void setCompanyByIdCompanyFk(CompanyEntity companyByIdCompanyFk) {
        this.companyByIdCompanyFk = companyByIdCompanyFk;
    }

    public Collection<SystemStewartPlatformEntity> getSystemStewartPlatformsByIdClient() {
        return systemStewartPlatformsByIdClient;
    }

    public void setSystemStewartPlatformsByIdClient(Collection<SystemStewartPlatformEntity> systemStewartPlatformsByIdClient) {
        this.systemStewartPlatformsByIdClient = systemStewartPlatformsByIdClient;
    }
}
