package com.example.Clients.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "companies", schema = "public", catalog = "postgres")
public class CompaniesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_account", nullable = false, length = -1)
    private String idAccount;
    @Basic
    @Column(name = "title", nullable = false, length = 500)
    private String title;
    @Basic
    @Column(name = "description_company", nullable = false, length = 50)
    private String descriptionCompany;
    @Basic
    @Column(name = "address_company", nullable = false, length = 100)
    private String addressCompany;
    @Basic
    @Column(name = "email_company", nullable = false, length = 50)
    private String emailCompany;
    @Basic
    @Column(name = "phone_number_company", nullable = false, length = 50)
    private String phoneNumberCompany;
    @ManyToOne
    @JoinColumn(name = "id_account", referencedColumnName = "id", nullable = false)
    private AccountsEntity accountsByIdAccount;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "phone", nullable = false, length = -1)
    private String phone;
    @Basic
    @Column(name = "type_account", nullable = false, length = -1)
    private String typeAccount;
    @Basic
    @Column(name = "description", nullable = false, length = 400)
    private String description;
    @Basic
    @Column(name = "city", nullable = false, length = 100)
    private String city;
    @Basic
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @OneToMany(mappedBy = "companiesByIdCompany")
    private Collection<ClientsEntity> clientsByPhone;
    @ManyToOne
    @JoinColumn(name = "type_account", referencedColumnName = "title", nullable = false)
    private AccountsEntity accountsByTypeAccount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptionCompany() {
        return descriptionCompany;
    }

    public void setDescriptionCompany(String descriptionCompany) {
        this.descriptionCompany = descriptionCompany;
    }

    public String getAddressCompany() {
        return addressCompany;
    }

    public void setAddressCompany(String addressCompany) {
        this.addressCompany = addressCompany;
    }

    public String getEmailCompany() {
        return emailCompany;
    }

    public void setEmailCompany(String emailCompany) {
        this.emailCompany = emailCompany;
    }

    public String getPhoneNumberCompany() {
        return phoneNumberCompany;
    }

    public void setPhoneNumberCompany(String phoneNumberCompany) {
        this.phoneNumberCompany = phoneNumberCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompaniesEntity that = (CompaniesEntity) o;
        return id == that.id && Objects.equals(idAccount, that.idAccount) && Objects.equals(title, that.title) && Objects.equals(descriptionCompany, that.descriptionCompany) && Objects.equals(addressCompany, that.addressCompany) && Objects.equals(emailCompany, that.emailCompany) && Objects.equals(phoneNumberCompany, that.phoneNumberCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idAccount, title, descriptionCompany, addressCompany, emailCompany, phoneNumberCompany);
    }

    public AccountsEntity getAccountsByIdAccount() {
        return accountsByIdAccount;
    }

    public void setAccountsByIdAccount(AccountsEntity accountsByIdAccount) {
        this.accountsByIdAccount = accountsByIdAccount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<ClientsEntity> getClientsByPhone() {
        return clientsByPhone;
    }

    public void setClientsByPhone(Collection<ClientsEntity> clientsByPhone) {
        this.clientsByPhone = clientsByPhone;
    }

    public AccountsEntity getAccountsByTypeAccount() {
        return accountsByTypeAccount;
    }

    public void setAccountsByTypeAccount(AccountsEntity accountsByTypeAccount) {
        this.accountsByTypeAccount = accountsByTypeAccount;
    }
}
