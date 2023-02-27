package com.example.Clients.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "company", schema = "public", catalog = "postgres")
public class Company {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_company", nullable = false)
    private int idCompany;
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
    private Collection<Client> clientsByIdCompany;
    @ManyToOne
    @JoinColumn(name = "id_account_type_fk", referencedColumnName = "id_account_type", nullable = false)
    private AccountType accountTypeByIdAccountTypeFk;
}
