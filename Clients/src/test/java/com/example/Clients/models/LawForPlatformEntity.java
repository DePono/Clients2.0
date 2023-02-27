package com.example.Clients.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "law_for_platform", schema = "public", catalog = "postgres")
public class LawForPlatformEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_law_for_platform", nullable = false)
    private int idLawForPlatform;
    @Basic
    @Column(name = "id_stewart_platform_fk", nullable = false)
    private int idStewartPlatformFk;
    @Basic
    @Column(name = "law_type_plat", nullable = false, length = 50)
    private String lawTypePlat;
    @Basic
    @Column(name = "time_create_law_plat", nullable = false)
    private Timestamp timeCreateLawPlat;
    @Basic
    @Column(name = "time_update_law_plat", nullable = false)
    private Timestamp timeUpdateLawPlat;
    @ManyToOne
    @JoinColumn(name = "id_stewart_platform_fk", referencedColumnName = "id_stewart_platform", nullable = false)
    private StewartPlatformEntity stewartPlatformByIdStewartPlatformFk;

    public int getIdLawForPlatform() {
        return idLawForPlatform;
    }

    public void setIdLawForPlatform(int idLawForPlatform) {
        this.idLawForPlatform = idLawForPlatform;
    }

    public int getIdStewartPlatformFk() {
        return idStewartPlatformFk;
    }

    public void setIdStewartPlatformFk(int idStewartPlatformFk) {
        this.idStewartPlatformFk = idStewartPlatformFk;
    }

    public String getLawTypePlat() {
        return lawTypePlat;
    }

    public void setLawTypePlat(String lawTypePlat) {
        this.lawTypePlat = lawTypePlat;
    }

    public Timestamp getTimeCreateLawPlat() {
        return timeCreateLawPlat;
    }

    public void setTimeCreateLawPlat(Timestamp timeCreateLawPlat) {
        this.timeCreateLawPlat = timeCreateLawPlat;
    }

    public Timestamp getTimeUpdateLawPlat() {
        return timeUpdateLawPlat;
    }

    public void setTimeUpdateLawPlat(Timestamp timeUpdateLawPlat) {
        this.timeUpdateLawPlat = timeUpdateLawPlat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LawForPlatformEntity that = (LawForPlatformEntity) o;
        return idLawForPlatform == that.idLawForPlatform && idStewartPlatformFk == that.idStewartPlatformFk && Objects.equals(lawTypePlat, that.lawTypePlat) && Objects.equals(timeCreateLawPlat, that.timeCreateLawPlat) && Objects.equals(timeUpdateLawPlat, that.timeUpdateLawPlat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLawForPlatform, idStewartPlatformFk, lawTypePlat, timeCreateLawPlat, timeUpdateLawPlat);
    }

    public StewartPlatformEntity getStewartPlatformByIdStewartPlatformFk() {
        return stewartPlatformByIdStewartPlatformFk;
    }

    public void setStewartPlatformByIdStewartPlatformFk(StewartPlatformEntity stewartPlatformByIdStewartPlatformFk) {
        this.stewartPlatformByIdStewartPlatformFk = stewartPlatformByIdStewartPlatformFk;
    }
}
