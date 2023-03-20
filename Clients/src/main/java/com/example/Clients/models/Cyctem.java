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
@Table(name = "cyctems", schema = "public", catalog = "postgres")
public class Cyctem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Column(name = "description", nullable = false, length = 100)
    private String description;
    @Column(name = "time_create", nullable = false)
    private Timestamp timeCreate;
    @Column(name = "time_update", nullable = false)
    private Timestamp timeUpdate;
    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "id", nullable = false)
    private Client clientByIdClient;
    @ManyToOne
    @JoinColumn(name = "id_stewart_platform", referencedColumnName = "id", nullable = false)
    private Stewart stewartByIdStewartPlatform;
}
