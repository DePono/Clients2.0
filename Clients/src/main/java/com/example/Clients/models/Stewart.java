package com.example.Clients.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stewarts", schema = "public", catalog = "postgres")
public class Stewart {

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "ip_address", nullable = false, length = 50)
    private String ipAddress;
    @Id
    @Column(name = "port", nullable = false)
    private int port;

    @OneToMany(mappedBy = "stewartByIdStewart")
    private Collection<Law> lawById;
    @OneToMany(mappedBy = "stewartByIdStewartPlatform")
    private Collection<Cyctem> cyctemById;
}
