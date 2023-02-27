package com.example.Clients.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "account_type", schema = "public", catalog = "postgres")
public class AccountTypeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_account_type", nullable = false, length = 10)
    private String idAccountType;
    @Basic
    @Column(name = "name_account_type", nullable = false, length = 50)
    private String nameAccountType;
    @Basic
    @Column(name = "description_account", nullable = false, length = 100)
    private String descriptionAccount;
    @OneToMany(mappedBy = "accountTypeByIdAccountTypeFk")
    private Collection<CompanyEntity> companiesByIdAccountType;

    public String getIdAccountType() {
        return idAccountType;
    }

    public void setIdAccountType(String idAccountType) {
        this.idAccountType = idAccountType;
    }

    public String getNameAccountType() {
        return nameAccountType;
    }

    public void setNameAccountType(String nameAccountType) {
        this.nameAccountType = nameAccountType;
    }

    public String getDescriptionAccount() {
        return descriptionAccount;
    }

    public void setDescriptionAccount(String descriptionAccount) {
        this.descriptionAccount = descriptionAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTypeEntity that = (AccountTypeEntity) o;
        return Objects.equals(idAccountType, that.idAccountType) && Objects.equals(nameAccountType, that.nameAccountType) && Objects.equals(descriptionAccount, that.descriptionAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAccountType, nameAccountType, descriptionAccount);
    }

    public Collection<CompanyEntity> getCompaniesByIdAccountType() {
        return companiesByIdAccountType;
    }

    public void setCompaniesByIdAccountType(Collection<CompanyEntity> companiesByIdAccountType) {
        this.companiesByIdAccountType = companiesByIdAccountType;
    }
}
