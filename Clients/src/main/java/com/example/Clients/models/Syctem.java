package com.example.Clients.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "systems", schema = "public", catalog = "postgres")
public class Syctem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Column(name = "description_system", nullable = false, length = 100)
    private String descriptionSystem;
    @Column(name = "time_create_system", nullable = false)
    private Timestamp timeCreateSystem;
    @Column(name = "time_update_system", nullable = false)
    private Timestamp timeUpdateSystem;
    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "id", nullable = false)
    private Client clientByIdClient;
    @ManyToOne
    @JoinColumn(name = "id_stewart_platform", referencedColumnName = "id", nullable = false)
    private Stewart stewartByIdStewartPlatform;
}
