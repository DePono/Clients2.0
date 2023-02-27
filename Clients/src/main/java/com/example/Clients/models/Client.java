package com.example.Clients.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "client", schema = "public", catalog = "postgres")
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_client", nullable = false)
    private int idClient;
    @Basic
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Basic
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;
    @Basic
    @Column(name = "email_user", nullable = false, length = 50)
    private String emailUser;
    @Basic
    @Column(name = "phone_number", nullable = false, length = 50)
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(name = "id_company_fk", referencedColumnName = "id_company", nullable = false)
    private Company companyByIdCompanyFk;
    @OneToMany(mappedBy = "clientByIdClientFk")
    private Collection<System> systemStewartPlatformsByIdClient;
}