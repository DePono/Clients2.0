package com.example.Clients.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "stewart_platform", schema = "public", catalog = "postgres")
public class StewartPlatform {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_stewart_platform", nullable = false)
    private int idStewartPlatform;
    @Basic
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Basic
    @Column(name = "description_platform", nullable = false, length = 100)
    private String descriptionPlatform;
    @Basic
    @Column(name = "ip_address_platform", nullable = false, length = 50)
    private String ipAddressPlatform;
    @Basic
    @Column(name = "port_platform", nullable = false)
    private int portPlatform;
    @OneToMany(mappedBy = "stewartPlatformByIdStewartPlatformFk")
    private Collection<LawForPlatform> lawForPlatformsByIdStewartPlatform;
    @OneToMany(mappedBy = "stewartPlatformByIdStewartPlatform")
    private Collection<SystemStewartPlatform> systemStewartPlatformsByIdStewartPlatform;
}
