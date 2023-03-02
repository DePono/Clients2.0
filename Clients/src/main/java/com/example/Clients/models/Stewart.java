package com.example.Clients.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stewarts", schema = "public", catalog = "postgres")
public class Stewart {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "description_platform", nullable = false, length = 100)
    private String descriptionPlatform;

    @Column(name = "ip_address_platform", nullable = false, length = 50)
    private String ipAddressPlatform;

    @Column(name = "port_platform", nullable = false)
    private int portPlatform;

    @OneToMany(mappedBy = "stewartByIdStewart")
    private Collection<Law> lawById;
    @OneToMany(mappedBy = "stewartByIdStewartPlatform")
    private Collection<System> systemById;
}
