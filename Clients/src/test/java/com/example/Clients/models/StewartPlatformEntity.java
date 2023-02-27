package com.example.Clients.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "stewart_platform", schema = "public", catalog = "postgres")
public class StewartPlatformEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_stewart_platform", nullable = false)
    private int idStewartPlatform;
    @Basic
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Basic
    @Column(name = "description_platform", nullable = false, length = 100)
    private String descriptionPlatform;
    @Basic
    @Column(name = "ip_address_platform", nullable = false, length = 50)
    private String ipAddressPlatform;
    @Basic
    @Column(name = "port_platform", nullable = false)
    private int portPlatform;
    @OneToMany(mappedBy = "stewartPlatformByIdStewartPlatformFk")
    private Collection<LawForPlatformEntity> lawForPlatformsByIdStewartPlatform;
    @OneToMany(mappedBy = "stewartPlatformByIdStewartPlatform")
    private Collection<SystemStewartPlatformEntity> systemStewartPlatformsByIdStewartPlatform;

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

    public String getDescriptionPlatform() {
        return descriptionPlatform;
    }

    public void setDescriptionPlatform(String descriptionPlatform) {
        this.descriptionPlatform = descriptionPlatform;
    }

    public String getIpAddressPlatform() {
        return ipAddressPlatform;
    }

    public void setIpAddressPlatform(String ipAddressPlatform) {
        this.ipAddressPlatform = ipAddressPlatform;
    }

    public int getPortPlatform() {
        return portPlatform;
    }

    public void setPortPlatform(int portPlatform) {
        this.portPlatform = portPlatform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StewartPlatformEntity that = (StewartPlatformEntity) o;
        return idStewartPlatform == that.idStewartPlatform && portPlatform == that.portPlatform && Objects.equals(title, that.title) && Objects.equals(descriptionPlatform, that.descriptionPlatform) && Objects.equals(ipAddressPlatform, that.ipAddressPlatform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStewartPlatform, title, descriptionPlatform, ipAddressPlatform, portPlatform);
    }

    public Collection<LawForPlatformEntity> getLawForPlatformsByIdStewartPlatform() {
        return lawForPlatformsByIdStewartPlatform;
    }

    public void setLawForPlatformsByIdStewartPlatform(Collection<LawForPlatformEntity> lawForPlatformsByIdStewartPlatform) {
        this.lawForPlatformsByIdStewartPlatform = lawForPlatformsByIdStewartPlatform;
    }

    public Collection<SystemStewartPlatformEntity> getSystemStewartPlatformsByIdStewartPlatform() {
        return systemStewartPlatformsByIdStewartPlatform;
    }

    public void setSystemStewartPlatformsByIdStewartPlatform(Collection<SystemStewartPlatformEntity> systemStewartPlatformsByIdStewartPlatform) {
        this.systemStewartPlatformsByIdStewartPlatform = systemStewartPlatformsByIdStewartPlatform;
    }
}
