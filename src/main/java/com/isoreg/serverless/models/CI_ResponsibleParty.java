package com.isoreg.serverless.models;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ci_responsibleparty")
public class CI_ResponsibleParty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    private String individualname;

    public String getIndividualname() {
        return individualname;
    }

    public void setName(String individualname) {
        this.individualname = individualname;
    }

    private String organisationname;

    public String getOrganisationname() {
        return organisationname;
    }

    public void setOrganisationName(String organisationname) {
        this.organisationname = organisationname;
    }

    private String positionname;

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    private CI_Contact contactinfo;

    public CI_Contact getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(CI_Contact contactinfo) {
        this.contactinfo = contactinfo;
    }
}