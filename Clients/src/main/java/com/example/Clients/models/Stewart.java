package com.example.Clients.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "stewarts", schema = "public", catalog = "postgres")
public class Stewart {
    @Id
    @Column(name = "port", nullable = false)
    private Integer port;
    @Basic
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Basic
    @Column(name = "description", nullable = false, length = 100)
    private String description;
    @Basic
    @Column(name = "ip_address", nullable = false, length = 50)
    private String ipAddress;
    @ManyToOne
    @JoinColumn(name = "id_cyctem", referencedColumnName = "title",nullable = false)
    private Cyctem owner;
    @ManyToOne
    @JoinColumn(name = "title_law", referencedColumnName = "title", nullable = false)
    private Law lawsByTitleLaw;
}
