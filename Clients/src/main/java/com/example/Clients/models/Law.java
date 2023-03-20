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

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "time_create_law", nullable = false)
    private Timestamp timeCreateLaw;

    @Column(name = "time_update_law", nullable = false)
    private Timestamp timeUpdateLaw;
    @ManyToOne
    @JoinColumn(name = "id_stewart", referencedColumnName = "id", nullable = false)
    private Stewart stewartByIdStewart;
}
