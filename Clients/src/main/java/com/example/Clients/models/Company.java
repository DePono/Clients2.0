package com.example.Clients.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "companies", schema = "public", catalog = "postgres")
public class Company {
    @Id
    @Column(name = "phone", nullable = false)
    private Long phone;
    @Basic
    @Column(name = "title", nullable = false, length = 500)
    private String title;
    @Basic
    @Column(name = "description", nullable = false, length = 400)
    private String description;
    @Basic
    @Column(name = "city", nullable = false, length = 100)
    private String city;
    @Basic
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @OneToMany(mappedBy = "owner")
    private Collection<Client> clients;
    @ManyToOne
    @JoinColumn(name = "type_account", referencedColumnName = "title", nullable = false)
    private Account accountsByTypeAccount;
}
//контроль полей, редактирование, добавление в каждой старнице.