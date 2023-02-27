package com.example.Clients.models;

import javax.persistence.*;
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
    @Column(name = "title", nullable = false, length = 50)
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
}
