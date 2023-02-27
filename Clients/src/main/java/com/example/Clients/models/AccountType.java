package com.example.Clients.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "account_type", schema = "public", catalog = "postgres")
public class AccountType {
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
    private Collection<Company> companiesByIdAccountType;}
