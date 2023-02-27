package com.example.Clients.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "company", schema = "public", catalog = "postgres")
public class CompanyEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_company", nullable = false)
    private int idCompany;
    @Basic
    @Column(name = "id_account_type_fk", nullable = false, length = -1)
    private String idAccountTypeFk;
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
    @OneToMany(mappedBy = "companyByIdCompanyFk")
    private Collection<ClientEntity> clientsByIdCompany;
    @ManyToOne
    @JoinColumn(name = "id_account_type_fk", referencedColumnName = "id_account_type", nullable = false)
    private AccountTypeEntity accountTypeByIdAccountTypeFk;

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getIdAccountTypeFk() {
        return idAccountTypeFk;
    }

    public void setIdAccountTypeFk(String idAccountTypeFk) {
        this.idAccountTypeFk = idAccountTypeFk;
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
        CompanyEntity that = (CompanyEntity) o;
        return idCompany == that.idCompany && Objects.equals(idAccountTypeFk, that.idAccountTypeFk) && Objects.equals(title, that.title) && Objects.equals(descriptionCompany, that.descriptionCompany) && Objects.equals(addressCompany, that.addressCompany) && Objects.equals(emailCompany, that.emailCompany) && Objects.equals(phoneNumberCompany, that.phoneNumberCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCompany, idAccountTypeFk, title, descriptionCompany, addressCompany, emailCompany, phoneNumberCompany);
    }

    public Collection<ClientEntity> getClientsByIdCompany() {
        return clientsByIdCompany;
    }

    public void setClientsByIdCompany(Collection<ClientEntity> clientsByIdCompany) {
        this.clientsByIdCompany = clientsByIdCompany;
    }

    public AccountTypeEntity getAccountTypeByIdAccountTypeFk() {
        return accountTypeByIdAccountTypeFk;
    }

    public void setAccountTypeByIdAccountTypeFk(AccountTypeEntity accountTypeByIdAccountTypeFk) {
        this.accountTypeByIdAccountTypeFk = accountTypeByIdAccountTypeFk;
    }
}
