package com.example.Clients.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "laws", schema = "public", catalog = "postgres")
public class Law {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int idLawForPlatform;
    @Basic
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Basic
    @Column(name = "time_create_law_plat", nullable = false)
    private Timestamp timeCreateLawPlat;
    @Basic
    @Column(name = "time_update_law_plat", nullable = false)
    private Timestamp timeUpdateLawPlat;
    @ManyToOne
    @JoinColumn(name = "id_stewart", referencedColumnName = "id_stewart", nullable = false)
    private Stewart stewartPlatformByIdStewartFk;
}
