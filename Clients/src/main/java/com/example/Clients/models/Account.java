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
@Table(name = "accounts", schema = "public", catalog = "postgres")
public class Account {
    @Id
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Column(name = "description", nullable = false, length = 100)
    private String description;
    @OneToMany(mappedBy = "accountByIdAccount")
    private Collection<Company> companyById;
}
