package com.example.Clients.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "laws", schema = "public", catalog = "postgres")
public class LawsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_stewart", nullable = false)
    private int idStewart;
    @Basic
    @Column(name = "law_type_plat", nullable = false, length = 50)
    private String lawTypePlat;
    @Basic
    @Column(name = "time_create_law_plat", nullable = false)
    private Timestamp timeCreateLawPlat;
    @Basic
    @Column(name = "time_update_law_plat", nullable = false)
    private Timestamp timeUpdateLawPlat;
    @Basic
    @Column(name = "law_type", nullable = false, length = 50)
    private String lawType;
    @Basic
    @Column(name = "time_create_law", nullable = false)
    private Timestamp timeCreateLaw;
    @Basic
    @Column(name = "time_update_law", nullable = false)
    private Timestamp timeUpdateLaw;
    @ManyToOne
    @JoinColumn(name = "id_stewart", referencedColumnName = "port", nullable = false)
    private StewartsEntity stewartsByIdStewart;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdStewart() {
        return idStewart;
    }

    public void setIdStewart(int idStewart) {
        this.idStewart = idStewart;
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
        LawsEntity that = (LawsEntity) o;
        return id == that.id && idStewart == that.idStewart && Objects.equals(lawTypePlat, that.lawTypePlat) && Objects.equals(timeCreateLawPlat, that.timeCreateLawPlat) && Objects.equals(timeUpdateLawPlat, that.timeUpdateLawPlat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idStewart, lawTypePlat, timeCreateLawPlat, timeUpdateLawPlat);
    }

    public String getLawType() {
        return lawType;
    }

    public void setLawType(String lawType) {
        this.lawType = lawType;
    }

    public Timestamp getTimeCreateLaw() {
        return timeCreateLaw;
    }

    public void setTimeCreateLaw(Timestamp timeCreateLaw) {
        this.timeCreateLaw = timeCreateLaw;
    }

    public Timestamp getTimeUpdateLaw() {
        return timeUpdateLaw;
    }

    public void setTimeUpdateLaw(Timestamp timeUpdateLaw) {
        this.timeUpdateLaw = timeUpdateLaw;
    }

    public StewartsEntity getStewartsByIdStewart() {
        return stewartsByIdStewart;
    }

    public void setStewartsByIdStewart(StewartsEntity stewartsByIdStewart) {
        this.stewartsByIdStewart = stewartsByIdStewart;
    }
}
