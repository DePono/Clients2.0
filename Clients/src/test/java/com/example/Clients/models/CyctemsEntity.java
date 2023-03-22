package com.example.Clients.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cyctems", schema = "public", catalog = "postgres")
public class CyctemsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_client", nullable = false, length = -1)
    private String idClient;
    @Basic
    @Column(name = "id_stewart_platform", nullable = false)
    private int idStewartPlatform;
    @Basic
    @Column(name = "title", nullable = false, length = 50)
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
    private ClientsEntity clientsByIdClient;
    @ManyToOne
    @JoinColumn(name = "id_stewart_platform", referencedColumnName = "port", nullable = false)
    private StewartsEntity stewartsByIdStewartPlatform;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public int getIdStewartPlatform() {
        return idStewartPlatform;
    }

    public void setIdStewartPlatform(int idStewartPlatform) {
        this.idStewartPlatform = idStewartPlatform;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Timestamp timeCreate) {
        this.timeCreate = timeCreate;
    }

    public Timestamp getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(Timestamp timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CyctemsEntity that = (CyctemsEntity) o;
        return id == that.id && idStewartPlatform == that.idStewartPlatform && Objects.equals(idClient, that.idClient) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(timeCreate, that.timeCreate) && Objects.equals(timeUpdate, that.timeUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idClient, idStewartPlatform, title, description, timeCreate, timeUpdate);
    }

    public ClientsEntity getClientsByIdClient() {
        return clientsByIdClient;
    }

    public void setClientsByIdClient(ClientsEntity clientsByIdClient) {
        this.clientsByIdClient = clientsByIdClient;
    }

    public StewartsEntity getStewartsByIdStewartPlatform() {
        return stewartsByIdStewartPlatform;
    }

    public void setStewartsByIdStewartPlatform(StewartsEntity stewartsByIdStewartPlatform) {
        this.stewartsByIdStewartPlatform = stewartsByIdStewartPlatform;
    }
}
