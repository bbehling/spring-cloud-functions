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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
// @Table(name = "ci_responsibleparty")
public class CI_Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    private String contactinstructions;

    public String getContactinstructions() {
        return contactinstructions;
    }

    public void setContactinstructions(String contactinstructions) {
        this.contactinstructions = contactinstructions;
    }
}