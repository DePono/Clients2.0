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
@Table(name = "clients", schema = "public", catalog = "postgres")
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "phone_number", nullable = false, length = 50)
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "id", nullable = false)
    private Company companyByIdCompany;
    @OneToMany(mappedBy = "clientByIdClient")
    private Collection<System> systemById;
}