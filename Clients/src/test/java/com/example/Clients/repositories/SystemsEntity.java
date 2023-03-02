package com.example.Clients.repositories;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "systems", schema = "public", catalog = "postgres")
public class SystemsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_client", nullable = false)
    private int idClient;
    @Basic
    @Column(name = "id_stewart_platform", nullable = false)
    private int idStewartPlatform;
    @Basic
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Basic
    @Column(name = "description_system", nullable = false, length = 100)
    private String descriptionSystem;
    @Basic
    @Column(name = "time_create_system", nullable = false)
    private Timestamp timeCreateSystem;
    @Basic
    @Column(name = "time_update_system", nullable = false)
    private Timestamp timeUpdateSystem;
    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "id", nullable = false)
    private ClientsEntity clientsByIdClient;
    @ManyToOne
    @JoinColumn(name = "id_stewart_platform", referencedColumnName = "id", nullable = false)
    private StewartsEntity stewartsByIdStewartPlatform;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
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

    public String getDescriptionSystem() {
        return descriptionSystem;
    }

    public void setDescriptionSystem(String descriptionSystem) {
        this.descriptionSystem = descriptionSystem;
    }

    public Timestamp getTimeCreateSystem() {
        return timeCreateSystem;
    }

    public void setTimeCreateSystem(Timestamp timeCreateSystem) {
        this.timeCreateSystem = timeCreateSystem;
    }

    public Timestamp getTimeUpdateSystem() {
        return timeUpdateSystem;
    }

    public void setTimeUpdateSystem(Timestamp timeUpdateSystem) {
        this.timeUpdateSystem = timeUpdateSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemsEntity that = (SystemsEntity) o;
        return id == that.id && idClient == that.idClient && idStewartPlatform == that.idStewartPlatform && Objects.equals(title, that.title) && Objects.equals(descriptionSystem, that.descriptionSystem) && Objects.equals(timeCreateSystem, that.timeCreateSystem) && Objects.equals(timeUpdateSystem, that.timeUpdateSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idClient, idStewartPlatform, title, descriptionSystem, timeCreateSystem, timeUpdateSystem);
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
