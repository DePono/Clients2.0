package com.example.Clients.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "system_stewart_platform", schema = "public", catalog = "postgres")
public class SystemStewartPlatformEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_system_stewart_platform", nullable = false)
    private int idSystemStewartPlatform;
    @Basic
    @Column(name = "id_client_fk", nullable = false)
    private int idClientFk;
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
    @JoinColumn(name = "id_client_fk", referencedColumnName = "id_client", nullable = false)
    private ClientEntity clientByIdClientFk;
    @ManyToOne
    @JoinColumn(name = "id_stewart_platform", referencedColumnName = "id_stewart_platform", nullable = false)
    private StewartPlatformEntity stewartPlatformByIdStewartPlatform;

    public int getIdSystemStewartPlatform() {
        return idSystemStewartPlatform;
    }

    public void setIdSystemStewartPlatform(int idSystemStewartPlatform) {
        this.idSystemStewartPlatform = idSystemStewartPlatform;
    }

    public int getIdClientFk() {
        return idClientFk;
    }

    public void setIdClientFk(int idClientFk) {
        this.idClientFk = idClientFk;
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
        SystemStewartPlatformEntity that = (SystemStewartPlatformEntity) o;
        return idSystemStewartPlatform == that.idSystemStewartPlatform && idClientFk == that.idClientFk && idStewartPlatform == that.idStewartPlatform && Objects.equals(title, that.title) && Objects.equals(descriptionSystem, that.descriptionSystem) && Objects.equals(timeCreateSystem, that.timeCreateSystem) && Objects.equals(timeUpdateSystem, that.timeUpdateSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSystemStewartPlatform, idClientFk, idStewartPlatform, title, descriptionSystem, timeCreateSystem, timeUpdateSystem);
    }

    public ClientEntity getClientByIdClientFk() {
        return clientByIdClientFk;
    }

    public void setClientByIdClientFk(ClientEntity clientByIdClientFk) {
        this.clientByIdClientFk = clientByIdClientFk;
    }

    public StewartPlatformEntity getStewartPlatformByIdStewartPlatform() {
        return stewartPlatformByIdStewartPlatform;
    }

    public void setStewartPlatformByIdStewartPlatform(StewartPlatformEntity stewartPlatformByIdStewartPlatform) {
        this.stewartPlatformByIdStewartPlatform = stewartPlatformByIdStewartPlatform;
    }
}
