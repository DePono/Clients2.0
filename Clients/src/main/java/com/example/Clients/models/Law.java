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
@Table(name = "laws", schema = "public", catalog = "postgres")
public class Law {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "law_type_plat", nullable = false, length = 50)
    private String lawTypePlat;

    @Column(name = "time_create_law_plat", nullable = false)
    private Timestamp timeCreateLawPlat;

    @Column(name = "time_update_law_plat", nullable = false)
    private Timestamp timeUpdateLawPlat;
    @ManyToOne
    @JoinColumn(name = "id_stewart", referencedColumnName = "id", nullable = false)
    private Stewart stewartByIdStewart;
}
