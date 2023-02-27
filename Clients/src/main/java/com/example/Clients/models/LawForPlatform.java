package com.example.Clients.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "law_for_platform", schema = "public", catalog = "postgres")
public class LawForPlatform {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_law_for_platform", nullable = false)
    private int idLawForPlatform;
    @Basic
    @Column(name = "law_type_plat", nullable = false, length = 50)
    private String lawTypePlat;
    @Basic
    @Column(name = "time_create_law_plat", nullable = false)
    private Timestamp timeCreateLawPlat;
    @Basic
    @Column(name = "time_update_law_plat", nullable = false)
    private Timestamp timeUpdateLawPlat;
    @ManyToOne
    @JoinColumn(name = "id_stewart_platform_fk", referencedColumnName = "id_stewart_platform", nullable = false)
    private StewartPlatform stewartPlatformByIdStewartPlatformFk;
}
