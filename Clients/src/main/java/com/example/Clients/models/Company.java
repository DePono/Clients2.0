package com.example.Clients.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "companies", schema = "public", catalog = "postgres")
public class Company {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "description_company", nullable = false, length = 50)
    private String descriptionCompany;
    @Column(name = "address_company", nullable = false, length = 100)
    private String addressCompany;

    @Column(name = "email_company", nullable = false, length = 50)
    private String emailCompany;

    @Column(name = "phone_number_company", nullable = false, length = 50)
    private String phoneNumberCompany;
    @OneToMany(mappedBy = "companyByIdCompany")
    private Collection<Client> clientById;
    @ManyToOne
    @JoinColumn(name = "id_account", referencedColumnName = "id", nullable = false)
    private Account accountByIdAccount;
}
