package com.example.Clients.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "stewarts", schema = "public", catalog = "postgres")
public class StewartsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
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
    @OneToMany(mappedBy = "stewartsByIdStewartPlatform")
    private Collection<SystemsEntity> systemsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        StewartsEntity that = (StewartsEntity) o;
        return id == that.id && portPlatform == that.portPlatform && Objects.equals(title, that.title) && Objects.equals(descriptionPlatform, that.descriptionPlatform) && Objects.equals(ipAddressPlatform, that.ipAddressPlatform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, descriptionPlatform, ipAddressPlatform, portPlatform);
    }

    public Collection<SystemsEntity> getSystemsById() {
        return systemsById;
    }

    public void setSystemsById(Collection<SystemsEntity> systemsById) {
        this.systemsById = systemsById;
    }
}
