package com.example.Clients.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "systems", schema = "public", catalog = "postgres")
public class System {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
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
    @JoinColumn(name = "id_client", referencedColumnName = "id_client", nullable = false)
    private Client clientByIdClientFk;
    @ManyToOne
    @JoinColumn(name = "id_stewart", referencedColumnName = "id_stewart", nullable = false)
    private Stewart stewartPlatformByIdStewart;
}
