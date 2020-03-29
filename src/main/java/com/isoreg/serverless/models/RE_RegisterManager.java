package com.isoreg.serverless.models;

import java.sql.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "re_registermanager")
public class RE_RegisterManager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    private CI_ResponsibleParty contact;

    public CI_ResponsibleParty getContact() {
        return contact;
    }

    public void setContact(CI_ResponsibleParty contact) {
        this.contact = contact;
    }

}