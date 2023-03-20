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

    @Column(name = "description", nullable = false, length = 50)
    private String description;
    @Column(name = "city", nullable = false, length = 100)
    private String city;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "phone", nullable = false, length = 50)
    private String phone;
    @OneToMany(mappedBy = "companyByIdCompany")
    private Collection<Client> clientById;
    @ManyToOne
    @JoinColumn(name = "type_account", referencedColumnName = "id", nullable = false)
    private Account accountByIdAccount;

}
