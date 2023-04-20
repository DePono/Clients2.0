package com.example.Clients.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cyctems", schema = "public", catalog = "postgres")
public class Cyctem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "title", nullable = false)
    private String title;
    @Basic
    @Column(name = "description", nullable = false, length = 100)
    private String description;
    @Basic
    @Column(name = "time_create", nullable = false)
    private Timestamp timeCreate;
    @Basic
    @Column(name = "time_update", nullable = false)
    private Timestamp timeUpdate;
    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "phone", nullable = false)
    private Client clientsByIdClient;
    @OneToMany(mappedBy = "owner")
    private Collection<Stewart> stewarts;

}
