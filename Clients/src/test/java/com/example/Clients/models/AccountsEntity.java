package com.example.Clients.models;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Basic
    @Column(name = "title", nullable = false, length = -1)
    private String title;
    @Basic
    @Column(name = "description_account", nullable = false, length = -1)
    private String descriptionAccount;
    @OneToMany(mappedBy = "accountsByIdAccount")
    private Collection<CompaniesEntity> companiesById;
    @Basic
    @Column(name = "subscription_time", nullable = false, length = -1)
    private String subscriptionTime;
    @OneToMany(mappedBy = "accountsByTypeAccount")
    private Collection<CompaniesEntity> companiesByTitle;

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

    public String getSubscriptionTime() {
        return subscriptionTime;
    }

    public void setSubscriptionTime(String subscriptionTime) {
        this.subscriptionTime = subscriptionTime;
    }

    public Collection<CompaniesEntity> getCompaniesByTitle() {
        return companiesByTitle;
    }

    public void setCompaniesByTitle(Collection<CompaniesEntity> companiesByTitle) {
        this.companiesByTitle = companiesByTitle;
    }
}
