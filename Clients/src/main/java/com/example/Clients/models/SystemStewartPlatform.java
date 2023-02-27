package com.example.Clients.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "system_stewart_platform", schema = "public", catalog = "postgres")
public class SystemStewartPlatform {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_system_stewart_platform", nullable = false)
    private int idSystemStewartPlatform;
    @Basic
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Basic
    @Column(name = "description_system", nullable = false, length = 100)
    private String descriptionSystem;
    @Basic
    @Column(name = "time_create_system", nullable = false)
    private Timestamp timeCreateSystem;
    @Basic
    @Column(name = "time_update_system", nullable = false)
    private Timestamp timeUpdateSystem;
    @ManyToOne
    @JoinColumn(name = "id_client_fk", referencedColumnName = "id_client", nullable = false)
    private Client clientByIdClientFk;
    @ManyToOne
    @JoinColumn(name = "id_stewart_platform", referencedColumnName = "id_stewart_platform", nullable = false)
    private StewartPlatform stewartPlatformByIdStewartPlatform;
}
