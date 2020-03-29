package com.isoreg.serverless.models;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Table(name = "re_register")
@Entity
// @Table(name = "organization")
public class Re_Register {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "uuid")
    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    private String text;

    public String getext() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String contentsummary;

    public String getContentsummary() {
        return contentsummary;
    }

    public void setContentsummary(String contentsummary) {
        this.contentsummary = contentsummary;
    }

    private Date dateoflastchange;

    public Date getdateoflastchange() {
        return dateoflastchange;
    }

    public void setDateoflastchange(Date dateoflastchange) {
        this.dateoflastchange = dateoflastchange;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Date versiondate;

    public Date getVersiondate() {
        return versiondate;
    }

    public void setVersiondate(Date versiondate) {
        this.versiondate = versiondate;
    }

    private Date versionnumber;

    public Date getVersionnumber() {
        return versionnumber;
    }

    public void setVersionnumber(Date versionnumber) {
        this.versionnumber = versionnumber;
    }

    private UUID citation_uuid;

    public UUID getCitation_uuid() {
        return citation_uuid;
    }

    public void setCitation_uui(UUID citation_uuid) {
        this.citation_uuid = citation_uuid;
    }

    private UUID manager_uuid;

    public UUID getManager_uuid() {
        return manager_uuid;
    }

    public void setManager_uuid(UUID manager_uuid) {
        this.manager_uuid = manager_uuid;
    }

    private UUID operatinglanguage_uuid;

    public UUID getOperatinglanguage_uuid() {
        return operatinglanguage_uuid;
    }

    public void setOperatinglanguage_uuid(UUID operatinglanguage_uuid) {
        this.operatinglanguage_uuid = operatinglanguage_uuid;
    }

    private UUID owner_uuid;

    public UUID getOwner_uuid() {
        return owner_uuid;
    }

    public void setOwner_uuid(UUID owner_uuid) {
        this.owner_uuid = owner_uuid;
    }

    private UUID uniformresourceidentifier_uuid;

    public UUID getUniformresourceidentifier_uuid() {
        return uniformresourceidentifier_uuid;
    }

    public void setUniformresourceidentifier_uuid(UUID uniformresourceidentifier_uuid) {
        this.uniformresourceidentifier_uuid = uniformresourceidentifier_uuid;
    }
}