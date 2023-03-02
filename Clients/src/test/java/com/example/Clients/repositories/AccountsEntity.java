package com.example.Clients.repositories;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "accounts", schema = "public", catalog = "postgres")
public class AccountsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 10)
    private String id;
    @Basic
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Basic
    @Column(name = "description_account", nullable = false, length = 100)
    private String descriptionAccount;
    @OneToMany(mappedBy = "accountsByIdAccount")
    private Collection<CompaniesEntity> companiesById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        AccountsEntity that = (AccountsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(descriptionAccount, that.descriptionAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, descriptionAccount);
    }

    public Collection<CompaniesEntity> getCompaniesById() {
        return companiesById;
    }

    public void setCompaniesById(Collection<CompaniesEntity> companiesById) {
        this.companiesById = companiesById;
    }
}
