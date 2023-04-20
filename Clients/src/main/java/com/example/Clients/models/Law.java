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
@Table(name = "laws", schema = "public", catalog = "postgres")
public class Law {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "title", nullable = false)
    private String id;
    @Basic
    @Column(name = "condition", nullable = false, length = -1)
    private String condition;
    @Basic
    @Column(name = "description", nullable = false,length = -1)
    private String description;
    @OneToMany(mappedBy = "lawsByTitleLaw")
    private Collection<Stewart> stewartsByTitle;
}
